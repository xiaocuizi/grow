package com.gemini.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.zookeeper
 * @classname: ZkLock
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/11 22:05
 */
public class ZkLock implements Lock, Watcher {

    ZooKeeper zooKeeper = null;
    private String root_lock = "/locks";
    private String wait_lock;
    private String current_lock;
    private CountDownLatch countDownLatch;


    public ZkLock() {
        try {
            System.out.println("-->进行连接zk。。。。。。。。。。。。");
            zooKeeper = new ZooKeeper("192.168.81.130:2181", 4000, this);
            Stat stat = zooKeeper.exists(root_lock, false);
            System.out.println("-->stat="+stat);
            //判断节点是否存在
            if (stat == null) {
                zooKeeper.create(root_lock, "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void lock() {
       if(this.tryLock()){
           System.out.println(Thread.currentThread().getName()+"->恭喜获取锁成功."+current_lock);
       }
        try {
            waitLock(wait_lock);
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 处理等待锁
     * @param pre
     * @throws KeeperException
     * @throws InterruptedException
     */
    private void waitLock(String pre) throws KeeperException, InterruptedException {
        Stat stat = zooKeeper.exists(pre, true);
        if (stat != null) {
            System.out.println(Thread.currentThread().getName() + "->等待锁" + root_lock + "/" + pre + "释放.->");
            countDownLatch = new CountDownLatch(1);
            countDownLatch.await();
            System.out.println(Thread.currentThread().getName() + "->获取锁成功。" + current_lock);
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        //创建临时有序 节点
        try {
            current_lock = zooKeeper.create(root_lock + "/", "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
            System.out.println(Thread.currentThread() + "->" + current_lock + "尝试竞争。。。。");
            List<String> childrens = zooKeeper.getChildren(root_lock, false);
            SortedSet<String> set = new TreeSet<>();
            for (String s : childrens) {
                set.add(root_lock+"/"+s);
            }
            //判断是否是最小的节点
            String firstNode = set.first();
            //当前节点跟最小的节点进行比较
            if (current_lock.equals(firstNode)) {
              return true;
            }
            //判断当前的节点是不是最小的,如果有的话，会返回比其本身小的集合
            SortedSet<String> set1 = set.headSet(current_lock);
            if (!set1.isEmpty()) {
                /**
                 * 获得比当前节点更小的最后一个节点，设置为等等
                 */
                wait_lock = set1.last();
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        System.out.println(Thread.currentThread()+"->释放锁"+current_lock);
        try {
            zooKeeper.delete(current_lock,-1);
            current_lock =null;
            zooKeeper.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    @Override
    public void process(WatchedEvent event) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
            countDownLatch = null;
        }
    }
}

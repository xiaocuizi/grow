package com.gemini.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.zookeeper
 * @classname: ZkLockDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/11 22:30
 */
public class ZkLockDemo {
    public static void main(String[] args) {
        System.out.println("-->进行连接zk。。。。。。。。。。。。");
        String root_lock = "/locks";
        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.81.130:2181", 4000, null);
            Stat stat = zooKeeper.exists(root_lock, false);
            //判断节点是否存在
            if (stat == null) {
                String node = zooKeeper.create(root_lock, "0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
                System.out.println("-->node=" + node);
            }
        } catch (KeeperException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       /* SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(5);
        System.out.println(sortedSet.first());
        System.out.println(((TreeSet<Integer>) sortedSet).headSet(1));*/
        /*CountDownLatch countDownLatch =  new CountDownLatch(10);
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                try {
                    countDownLatch.await();
                    ZkLock zkLock = new ZkLock();
                    //模拟并发获取锁
                    zkLock.lock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            },Thread.currentThread().getName()+"-->"+i).start();
            countDownLatch.countDown();
        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

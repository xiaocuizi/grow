package com.gemini.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.zookeeper
 * @classname: ZooKeeperDemo
 * @description: ZooKeeper
 * @date 2018/12/11 14:51
 */
public class ZooKeeperDemo {
    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            ZooKeeper zooKeeper = new ZooKeeper("192.168.81.130:2181", 4000, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    if(Event.KeeperState.SyncConnected == event.getState()){
                       // countDownLatch.countDown();
                    }
                }
            });
            //countDownLatch.await();
            System.out.println("zooKeeper.getState:"+zooKeeper.getState());
            Thread.sleep(2000);
            System.out.println("zooKeeper.getState2:"+zooKeeper.getState());
            zooKeeper.create("/orderservice/list","0".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            zooKeeper.exists("/orderservice/list",true);
            zooKeeper.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (KeeperException e) {
            e.printStackTrace();
        }
    }
}

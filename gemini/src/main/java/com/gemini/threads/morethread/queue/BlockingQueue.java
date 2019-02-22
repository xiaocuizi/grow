package com.gemini.threads.morethread.queue;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.queue
 * @classname: BlockingQueue
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/3 12:05
 */
public class BlockingQueue {


    private Object lock = new Object();
    private int queueMaxSize;
    public BlockingQueue(int queueMaxSize) {
        this.queueMaxSize = queueMaxSize;
    }

    private static List<String> queues = new ArrayList<String>();

    public void put(String element) {
        synchronized (lock) {
            if (this.queues.size() == queueMaxSize) {
                System.out.println("队列已满.....程序等待....");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.queues.add(element);
            System.out.println("put 元素"+element+"操作成功,通知消费方take....");
            lock.notifyAll();
        }
    }

    public  void take() {
        synchronized (lock) {
            if (this.queues.size() == 0) {
                System.out.println("队列中元素为空.....程序等待....");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.queues.get(0);
            this.queues.remove(0);
            System.out.println("获取队列中元素成功.....通知生成方进行put....");
            lock.notifyAll();
        }
    }

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new BlockingQueue(5);
        new Thread(()->{
            blockingQueue.put("1");
            blockingQueue.put("2");
            blockingQueue.put("3");
            blockingQueue.put("4");
            blockingQueue.put("5");
            blockingQueue.put("6");
        },"T1:put---->").start();

        new Thread(()->{
            blockingQueue.take();
        },"T2: take--->").start();
    }

}

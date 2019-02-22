package com.gemini.threads.morethread.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: CountDownLanchDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/28 16:39
 */
public class CountDownLanchDemo {
    public static void main(String[] args) {
        CountDownLatch  countDownLatch = new CountDownLatch(3);
        new Thread(()->{
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            countDownLatch.countDown();
        }).start();
        new Thread(()->{
            countDownLatch.countDown();
        }).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行完毕。。。");
    }
}

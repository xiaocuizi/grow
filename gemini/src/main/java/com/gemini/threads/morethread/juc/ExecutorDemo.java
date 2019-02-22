package com.gemini.threads.morethread.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: ExecutorDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/29 11:14
 */
public class ExecutorDemo{
    //


    static class Test implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newSingleThreadExecutor();

        for (int i = 0; i <100 ; i++) {
            System.out.println("第"+i+"个");
            executorService.execute(new Test());
        }

    }
}

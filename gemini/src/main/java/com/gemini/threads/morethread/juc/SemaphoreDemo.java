package com.gemini.threads.morethread.juc;

import java.util.concurrent.Semaphore;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: SemaphoreDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/28 18:57
 */
public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i <10 ; i++) {
             new DoSth(i,semaphore).start();
        }
    }

    static class DoSth extends Thread {
        private int num;
        private Semaphore semaphore;


        public DoSth(int num,Semaphore semaphore1) {
            this.num = num;
            this.semaphore = semaphore1;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println("第" + num + "个获得锁");
                Thread.sleep(2000);
                semaphore.release();
                System.out.println("=================");
                System.out.println("第" + num + "个释放锁");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

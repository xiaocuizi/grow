package com.gemini.threads.morethread;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: TheadInterputDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/21 21:19
 */
public class TheadInterputDemo {
    private static  int i = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                ++i;
            }
        },"TheadInterputDemo");
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i="+i);
        thread.interrupt();
        thread.stop();
    }
}

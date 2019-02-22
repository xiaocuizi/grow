package com.gemini.threads.morethread;

import java.io.IOException;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: SynchronizedDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/23 17:18
 */
public class SynchronizedDemo {
    /*public static int count = 0;
     public void SynchronizedDemo(){
         synchronized (SynchronizedDemo.class){

         }
     }
    public synchronized void incr(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            new Thread(()->{
                new SynchronizedDemo().incr();
            }).start();
        }
    }*/


    private static int count = 0;
    public void synchronizedDemo(){
        synchronized (this){

        }

    }

    public synchronized static  void incr(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public static void main(String[] args) {
        SynchronizedDemo synchronizedDemo1 = new SynchronizedDemo();
        SynchronizedDemo synchronizedDemo2 = new SynchronizedDemo();
        synchronizedDemo1.synchronizedDemo();
        synchronizedDemo2.synchronizedDemo();
        for (int i=0;i<1000;i++){
            new Thread(()->{
                synchronizedDemo1.incr();
            },"thread:"+i).start();

        }
        /*try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}

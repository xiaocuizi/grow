package com.gemini.threads.morethread;

import java.util.concurrent.TimeUnit;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: TheadStatusDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/21 21:00
 */
public class TheadStatusDemo {
    public static void main(String[] args) {
         new Thread(()->{
           while (true){
               try {
                   TimeUnit.SECONDS.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        },"time-waiting").start();
         new Thread(()->{
             while (true){
                synchronized(TheadStatusDemo.class){
                    try {
                        TheadStatusDemo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
             }
         },"watting").start();
    }
    static class BlockThead0 extends Thread{
      public void run(){
          synchronized (BlockThead0.class){
              while (true){
                  try {
                      TimeUnit.SECONDS.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
      }
    }
}

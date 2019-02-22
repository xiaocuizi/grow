package com.gemini.threads.morethread;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: ThreadWait
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/25 20:28
 */
public class ThreadNotify extends Thread{
    Object lock;
    public ThreadNotify(Object o){
        this.lock = o;
    }

    @Override
    public void  run(){
        synchronized (lock){
            System.out.println("开始执行  。。。notify");
            try {
                lock.notify();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("结束执行  。。。notify");
        }
    }
}

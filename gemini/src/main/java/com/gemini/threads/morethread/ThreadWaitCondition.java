package com.gemini.threads.morethread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: ThreadWait
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/25 20:28
 */
public class ThreadWaitCondition extends Thread{
    private Lock lock;
    private Condition condition;
    public ThreadWaitCondition(Lock lock,Condition condition){
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("开始执行  。。。wait");
            condition.await();
            System.out.println("结束执行  。。。wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

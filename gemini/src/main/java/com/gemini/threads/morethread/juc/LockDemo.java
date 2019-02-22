package com.gemini.threads.morethread.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: LockDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/25 21:25
 */
public class LockDemo  {
    static Lock lock = new ReentrantLock();//有公平锁和非公平锁
    private static int count = 0;

    public static void incr() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        count++;
        lock.unlock();
    }

    public static void main(String[] args) {

    }
}

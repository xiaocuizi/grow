package com.gemini.threads.morethread.juc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: RWLockDemo
 * @description: 重入读写锁
 * @date 2018/12/25 22:04
 */
public class RWLockDemo {

    /**
     * 排他锁
     * 共享锁在同一时刻可有多个线程获得锁
     * 读锁，写锁（读多写少 ）
     * 读-读的共享
     * 读-写不共享
     * 写-写不共享
     */

    static Map<String,Object> chacheMap =  new HashMap<>();

    static ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
     //读
    static Lock read = reentrantReadWriteLock.readLock();
    //写
    static Lock write = reentrantReadWriteLock.writeLock();

    /**
     * 读
     * @param key
     * @return
     */
    public static final Object get(String key){
        read.lock();//读锁
        try {
            return chacheMap.get(key);
        } finally {
            read.unlock();
        }
    }

    /**
     * 写缓存
     * @param key
     * @param value
     * @return
     */
    public static final Object set(String key,Object value){
        write.lock();//读锁
        try {
            return chacheMap.put(key,value);
        } finally {
            write.unlock();
        }
    }
}

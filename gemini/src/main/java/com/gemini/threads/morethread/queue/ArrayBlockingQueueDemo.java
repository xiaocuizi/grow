package com.gemini.threads.morethread.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.queue
 * @classname: ArrayBlockingQueueDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/2 17:05
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue failQueue = new ArrayBlockingQueue(1000, true);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        DelayQueue delayQueue = new DelayQueue();
        Object object =  new Object();
        delayQueue.add((Delayed) object);
    }
}

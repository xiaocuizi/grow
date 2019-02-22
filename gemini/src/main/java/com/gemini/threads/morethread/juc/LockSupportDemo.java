package com.gemini.threads.morethread.juc;

import java.util.concurrent.locks.LockSupport;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: LockSupportDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/31 9:30
 */
public class LockSupportDemo {
    public static void main(String[] args) {
        LockSupport.park();

        LockSupport.parkNanos(1);
        LockSupport.parkUntil(343);
        LockSupport.parkNanos(new Object(),4546);
    }
}

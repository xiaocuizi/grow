package com.gemini.threads.morethread;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: SynchronizedDemo2
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/29 18:08
 */
public class SynchronizedDemo2 {

    static int count = 0;

    public static synchronized void incr(){
        count ++;
    }

    public static void main(String[] args) {

    }
}

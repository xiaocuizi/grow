package com.gemini.threads.morethread;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: VolatileDemo2
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/22 18:22
 */
public class VolatileDemo2 {
    volatile int i= 0;
    public void incr(){
        i++;
    }

    public static void main(String[] args) {
        new VolatileDemo2().incr();
    }

}

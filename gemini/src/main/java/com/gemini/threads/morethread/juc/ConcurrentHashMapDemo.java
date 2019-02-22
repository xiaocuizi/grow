package com.gemini.threads.morethread.juc;

import com.gemini.map.HashMapDemo;

import java.util.HashMap;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.juc
 * @classname: ConcurrentHashMapDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/31 12:16
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        final int MAXIMUM_CAPACITY = 1 << 30;
        System.out.println("-------->" + MAXIMUM_CAPACITY);
        HashMap map = new HashMap();
        A a = new A();
        System.out.println("------->"+a.hashCode());
        System.out.println("------->" +  a.hashCode() % 16);
    }

    static class  A {

        private int anInt;

    }
}

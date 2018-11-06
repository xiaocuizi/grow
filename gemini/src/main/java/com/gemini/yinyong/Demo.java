package com.gemini.yinyong;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Demo {
    //public static  Object object = new Object();

    public static void main(String[] args) {
        /*Object object2 = object;
        object =null;
        System.gc();
        System.out.println("object回收之后:"+object);*/
        /*Object obj = new Object();
        SoftReference reference = new SoftReference(obj);
        System.out.println(reference.get());*/
        Object obj = new Object();
        WeakReference reference = new WeakReference(obj);
        System.out.println(reference.get());


    }
}

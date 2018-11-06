package com.gemini.yinyong;

import java.lang.reflect.Field;

public class IntegerDemo {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a = 1,b=2;
        System.out.println("a="+a+",b="+b);
        //swap(a,b);
        System.out.println("a="+a+",b="+b);


    }

    private static void swap(Integer i1, Integer i2) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getField("value");
        int tmp = i1;
        field.set(i1,tmp);
        field.set(i1,i2);
        i1=i2;
        i2= tmp;

    }
}

package com.gemini.pattern.factory.simple;

import com.gemini.pattern.factory.Telunsu;

public class TestDemo {
    public static void main(String[] args) {
        //System.out.println(new Telunsu().getName());
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getName("特仑苏").getName());
    }
}

package com.gemini.pattern.factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        //System.out.println(new Factory().getMilk());
        Factory factory = new TelunsuFactoroy();
        System.out.println(factory.getMilk());;
    }
}

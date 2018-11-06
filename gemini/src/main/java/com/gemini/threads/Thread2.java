package com.gemini.threads;

public class Thread2 {
    private static  volatile Thread2 instance = null;

    public static void main(String[] args) {
        Thread2 thread2 = getInstance();
    }

    public static Thread2 getInstance() {

        if (instance == null) {
            instance = new Thread2();
        }
        return instance;
    }
}

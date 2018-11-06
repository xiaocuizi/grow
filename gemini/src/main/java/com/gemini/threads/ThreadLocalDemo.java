package com.gemini.threads;

public class ThreadLocalDemo {

    private static Integer num = 0;

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 0;
        }
    };

    /*static class Index(){

        int num = 0;

    }*/
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                int numIngeter = threadLocal.get();
                numIngeter += 5;
                System.out.println("num=" + Thread.currentThread().getName() + "->" + numIngeter);
            }, "Thread i " + i).start();
        }
    }


}

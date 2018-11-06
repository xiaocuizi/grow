package com.gemini.pattern.lazy;

public class LazyThree {

    private static boolean init = false;


    private LazyThree() {
        synchronized (LazyThree.class) {
            System.out.println("------>1");
            if (init) {
                throw new RuntimeException("单例被入侵了。。。。");
            } else {
                init = true;
                System.out.println("------>2");
            }
        }
    }

    public static LazyThree getInstance() {
        System.out.println("------>3");
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyThree LAZY = new LazyThree();
    }
}

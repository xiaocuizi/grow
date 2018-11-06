package com.gemini.pattern.lazy;

public class LazyTwo {
    private static  LazyTwo lazyTwo= null;


    public static synchronized LazyTwo getInstance(){

        if(lazyTwo ==null){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}

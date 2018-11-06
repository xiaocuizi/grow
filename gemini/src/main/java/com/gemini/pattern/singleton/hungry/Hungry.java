package com.gemini.pattern.singleton.hungry;




public class Hungry {




    public static Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }
}

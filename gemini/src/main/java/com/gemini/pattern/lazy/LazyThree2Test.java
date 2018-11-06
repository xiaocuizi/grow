package com.gemini.pattern.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyThree2Test {


    public static void main(String[] args) {
       Class<?> classz = LazyThree.class;
        try {
            Constructor constructor = classz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            Object object2 = constructor.newInstance();
            System.out.println("object--->"+object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

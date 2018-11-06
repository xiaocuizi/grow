package com.gemini.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("hey", "hello");
        Object obj = new Object();
        int hash = obj.hashCode();
        System.out.println(obj.hashCode());
        int i = (16 - 1) & hash;
        System.out.println("i-->" + i);
    }
}

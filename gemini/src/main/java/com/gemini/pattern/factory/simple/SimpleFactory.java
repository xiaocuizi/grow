package com.gemini.pattern.factory.simple;

import com.gemini.pattern.factory.Milk;
import com.gemini.pattern.factory.Telunsu;

public class SimpleFactory {

    public  Milk getName(String name){
        if("特仑苏".equals(name)) {
            return new Telunsu();
        }
        return null;
    }
}

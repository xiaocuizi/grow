package com.gemini.pattern.factory.func;

import com.gemini.pattern.factory.Milk;
import com.gemini.pattern.factory.Telunsu;

public class TelunsuFactoroy implements Factory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}

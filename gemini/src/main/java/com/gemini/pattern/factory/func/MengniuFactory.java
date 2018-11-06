package com.gemini.pattern.factory.func;

import com.gemini.pattern.factory.Mengniu;
import com.gemini.pattern.factory.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}

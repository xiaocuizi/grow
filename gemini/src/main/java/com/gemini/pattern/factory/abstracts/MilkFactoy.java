package com.gemini.pattern.factory.abstracts;

import com.gemini.pattern.factory.Milk;
import com.gemini.pattern.factory.Telunsu;
import com.gemini.pattern.factory.func.MengniuFactory;
import com.gemini.pattern.factory.func.TelunsuFactoroy;

public class MilkFactoy extends AbstractFactory {
    /**
     * 蒙牛
     *
     * @return
     */
    @Override
    public Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    /**
     * 特仑苏
     *
     * @return
     */
    @Override
    public Milk getTelunsu() {
        return new TelunsuFactoroy().getMilk();
    }
}

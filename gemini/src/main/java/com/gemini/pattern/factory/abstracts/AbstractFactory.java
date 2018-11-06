package com.gemini.pattern.factory.abstracts;

import com.gemini.pattern.factory.Milk;

/**
 * 抽象工厂
 *
 * 公共逻辑
 * 方便统一管理
 * 易于扩展
 * 对于用户而言修改很简单
 */
public abstract class AbstractFactory {

    /**
     * 蒙牛
     * @return
     */
    public abstract Milk getMengniu();

    /**
     * 特仑苏
     * @return
     */
    public abstract Milk getTelunsu();
}

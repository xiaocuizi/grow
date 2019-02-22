package com.gemini.pattern.proxy.jdk2;

import java.lang.reflect.Proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.proxy.jdk2
 * @classname: TestDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/7 16:34
 */
public class TestDemo {
    public static void main(String[] args) {
                IGPHello igpHello  = (IGPHello)Proxy.newProxyInstance(IGPHello.class.getClassLoader(),
                        new Class[]{IGPHello.class},new IGPHelloProxy(new IGPHelloImpl()));
        igpHello.sayHello();
    }
}

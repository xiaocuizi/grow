package com.gemini.pattern.proxy.jdk2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.proxy.jdk2
 * @classname: IGPHelloProxy
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/7 16:21
 */
public class IGPHelloProxy implements InvocationHandler {

    private IGPHello igpHello;
    public IGPHelloProxy (IGPHello object){
        this.igpHello = object;
        //Class clazz = igpHello.getClass();
        //return (IGPHello)Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.igpHello,args);
    }
}

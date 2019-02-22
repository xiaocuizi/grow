package com.gemini.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.proxy.cglib
 * @classname: CgLibMeipo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/23 17:44
 */
public class CgLibMeipo implements MethodInterceptor {


    /**
     *
     * @param clazz
     * @return
     */
    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();
        //要把哪个类设置将生成的
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       //业务的增强
        System.out.println("我是媒婆：我要给你找对象，现在我已经拿到你的需求了");
        System.out.println("开始物色");
        methodProxy.invokeSuper(o,objects);
        System.out.println("如果合适就结婚");
        return o;
    }
}

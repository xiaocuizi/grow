package com.gemini.pattern.proxy.jdk;

import com.gemini.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.proxy.jdk
 * @classname: JdkMeiPuo
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/4 16:26
 */
public class JdkMeiPuo implements InvocationHandler {
    private Person target;

    /**
     * @param person
     * @return
     * @throws Exception
     */
    public Object getInstance(Person person) throws Exception {
        this.target = person;
        Class<?> clazz = target.getClass();
        //用来生成一个对象实例（字节码重组原理）
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，开始找对象，物色");
        method.invoke(this.target,args);
        System.out.println("合适的话，准备结婚。。。。");
        return null;
    }
}



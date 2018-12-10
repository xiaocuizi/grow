package com.gemini.rmi.rpc.client;

import java.lang.reflect.Proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc.client
 * @classname: PrcClientProxy
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:18
 */
public class PrcClientProxy<T>  {
    public T getServie(Class<T> interfaces, int port, String host) {
        //ClassLoader loader,
        //                                          Class<?>[] interfaces,
        //                                          InvocationHandler h
        return (T) Proxy.newProxyInstance(interfaces.getClassLoader(), new Class[]{interfaces}, new RemoteInvocationHandler(port, host));
    }
}

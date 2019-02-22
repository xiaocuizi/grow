package com.gemini.rmi.rpc.client;

import com.gemini.rmi.rpc.server.IGPHello;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc
 * @classname: RpcClientDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:03
 */
public class RpcClientDemo {
    public static void main(String[] args) {
        PrcClientProxy prcClientProxy = new PrcClientProxy();
        IGPHello igpHello = (IGPHello) prcClientProxy.getServie(IGPHello.class,9999,"localhost") ;
        String string = igpHello.sayHello("小崔子");
        System.out.println("----->string="+string);
    }
}

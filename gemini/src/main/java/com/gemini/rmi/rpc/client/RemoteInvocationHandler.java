package com.gemini.rmi.rpc.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc.client
 * @classname: RemoteInvocationHandler
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:29
 */
public class RemoteInvocationHandler implements InvocationHandler {

    private int port;
    private String host;

    public RemoteInvocationHandler(int port, String host) {
        this.port = port;
        this.host = host;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = new RpcRequest(method.getDeclaringClass().getName(), method.getName(), args);
        RpcTransport transport = new RpcTransport(this.host, this.port);
        return transport.send(rpcRequest);
    }


}

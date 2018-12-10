package com.gemini.rmi.rpc.server;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc.server
 * @classname: RPCServerDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 17:51
 */
public class RPCServerDemo {
    public static void main(String[] args) {
         RpcServer rpcServer = new RpcServer();
         rpcServer.publisher(IGPHello.class,9999);
        System.out.println("--------->服务端发布服务成功..");
    }
}

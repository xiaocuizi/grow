package com.gemini.rmi.rpc.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc
 * @classname: RpcServer
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:03
 */
public class RpcServer {

    public void publisher(final Object service, int port) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                System.out.println("------->服务端已启动，等待请求......");
                Socket socket = serverSocket.accept();
                executorService.execute(new ProccessHandler(service, socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

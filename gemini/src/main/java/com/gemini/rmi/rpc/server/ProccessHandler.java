package com.gemini.rmi.rpc.server;

import com.gemini.rmi.rpc.client.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc
 * @classname: ProccessHandler
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:08
 */
public class ProccessHandler implements Runnable{
    private Object service;
    private Socket socket;

    public ProccessHandler(Object service, Socket socket) {
        this.service = service;
        this.socket = socket;
    }

    public Object getService() {
        return service;
    }

    public void setService(Object service) {
        this.service = service;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("------------->处理请求");
        //TODO 处理请求
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            RpcRequest request = (RpcRequest) inputStream.readObject();
            Object result = invoke(request);
            //写回用户端
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(result);
            objectOutputStream.flush();
            inputStream.close();
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Object invoke(RpcRequest rpcRequest) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Object[] args =  rpcRequest.getParamers();
        Class<?>[]  types  = new Class[args.length];
        for (int i=0;i<args.length;i++){
            types[i] = args[i].getClass();
        }
        String name = rpcRequest.getMethodName();
        Method method = service.getClass().getMethod(name, types);
        return  method.invoke(service,args);
    }
}

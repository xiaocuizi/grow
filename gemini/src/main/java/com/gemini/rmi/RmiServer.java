package com.gemini.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi
 * @classname: RmiServer
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 10:46
 */
public class RmiServer {

    public static void main(String[] args) {
        try {
            IhelloService ihelloService = new IhelloServiceImpl();
            LocateRegistry.createRegistry(1099);
            try {
                Naming.bind("rmi://127.0.0.1/hello",ihelloService);
            } catch (AlreadyBoundException e) {
                e.printStackTrace();
            }
            System.out.println("服务启动成功。。。。。。。。。。。");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

package com.gemini.rmi.clent;

import com.gemini.rmi.IhelloService;
import com.gemini.rmi.IhelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.clent
 * @classname: ClientDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 10:40
 */
public class ClientDemo {

    public static void main(String[] args) {
        try {
            IhelloService service = (IhelloService)Naming.lookup("rmi://127.0.0.1/hello");
            String name = service.say("xiaocuizi");
            System.out.println("name----->"+name);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

package com.gemini.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi
 * @classname: IhelloServiceImpl
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 10:38
 */
public class IhelloServiceImpl  extends UnicastRemoteObject implements IhelloService{

    protected IhelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String say(String name) throws RemoteException {
        System.out.println("say hello~" + new Date().getTime());
        return name + "_" + new Date().getTime();
    }
}

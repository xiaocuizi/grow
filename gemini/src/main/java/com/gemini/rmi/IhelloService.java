package com.gemini.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi
 * @classname: IhelloService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 10:37
 */
public interface IhelloService extends Remote {

    public String say(String name)  throws RemoteException;
}

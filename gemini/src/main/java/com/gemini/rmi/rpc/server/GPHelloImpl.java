package com.gemini.rmi.rpc.server;

import java.util.Date;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc
 * @classname: GPHelloImpl
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 15:52
 */
public class GPHelloImpl implements IGPHello {
    /**
     * hello
     *
     * @param msg
     * @return
     */
    @Override
    public String sayHello(String msg) {
        return "hello," + msg + "_" + new Date().getTime();
    }
}

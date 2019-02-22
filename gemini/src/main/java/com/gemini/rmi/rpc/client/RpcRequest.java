package com.gemini.rmi.rpc.client;

import java.io.Serializable;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.rmi.rpc.client
 * @classname: RpcRequest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/10 16:24
 */
public class RpcRequest implements Serializable {
    private static final long serialVersionUID = -4645656524391427549L;
    private String className;

    private String methodName;

    /**
     * 参数
     */
    private Object[]  paramers;

    public RpcRequest(String className, String methodName, Object[] args) {
        this.className = className;
        this.methodName = methodName;
        this.paramers = args;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParamers() {
        return paramers;
    }

    public void setParamers(Object[] paramers) {
        this.paramers = paramers;
    }
}

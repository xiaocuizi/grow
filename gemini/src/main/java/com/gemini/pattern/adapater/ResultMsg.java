package com.gemini.pattern.adapater;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.adapater
 * @classname: ResultMsg
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 13:06
 */
public class ResultMsg<T> {
    private int code;
    private T data;
    private String msg;

    public ResultMsg(int code,  String msg,T data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package com.gemini.pattern.celue;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue
 * @classname: PayStatus
 * @Description: 支付状态
 * @date 2018/12/5 12:02
 */
public class PayStatus {
    private int code;
    private Object data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PayStatus(int code,String msg ,Object data ) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态：PayStatus{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}



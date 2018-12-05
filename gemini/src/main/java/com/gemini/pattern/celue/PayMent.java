package com.gemini.pattern.celue;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue
 * @classname: PayMent
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 12:02
 */
public interface PayMent {


    /**
     * 支付
     * @param uid
     * @param amount
     * @return
     */
    public PayStatus  pay(String uid,double amount);
}

package com.gemini.pattern.celue.paymethod;

import com.gemini.pattern.celue.PayMent;
import com.gemini.pattern.celue.PayStatus;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue.paymethod
 * @classname: WeChatPay
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 12:14
 */
public class WeChatPay implements PayMent {
    /**
     * 支付
     *
     * @param uid
     * @param amount
     * @return
     */
    @Override
    public PayStatus pay(String uid, double amount) {
        System.out.println("WeChatPay：欢迎微信支付");
        System.out.println("WeChatPay：查询余额....");
        System.out.println("WeChatPay：微信支付成功....");
        return new PayStatus(200,"支付成功",200);
    }
}



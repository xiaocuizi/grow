package com.gemini.pattern.celue.paymethod;

import com.gemini.pattern.celue.PayMent;
import com.gemini.pattern.celue.PayStatus;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue.paymethod
 * @classname: AliPay
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 12:10
 */
public class AliPay implements PayMent{
    @Override
    public PayStatus pay(String uid, double amount) {
        System.out.println("AliPay：欢迎使用支付宝");
        System.out.println("AliPay：查询余额....");
        System.out.println("AliPay：支付宝支付成功....");
        return new PayStatus(200,"支付成功",200);
    }
}



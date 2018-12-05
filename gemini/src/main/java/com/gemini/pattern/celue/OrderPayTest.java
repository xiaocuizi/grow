package com.gemini.pattern.celue;

import com.gemini.pattern.celue.paymethod.AliPay;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue
 * @classname: OrderPayTest
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 12:07
 */
public class OrderPayTest {

    public static void main(String[] args) {
        Order order = new Order("1","200202020",0.6);
        //order.pay(new AliPay());
        //order.pay(PayType.ALI_PAY);
        order.pay(PayType.WECHAT_PAY);
        System.out.println();
    }
}



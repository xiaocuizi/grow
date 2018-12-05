package com.gemini.pattern.celue;

import com.gemini.pattern.celue.paymethod.AliPay;
import com.gemini.pattern.celue.paymethod.WeChatPay;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue
 * @classname: PayType
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 12:23
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay());
    private PayMent payMent;

    PayType(PayMent payMent) {
        this.payMent = payMent;
    }

    public PayMent get() {
        return this.payMent;
    }
}

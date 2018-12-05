package com.gemini.pattern.celue;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.celue
 * @classname: Order
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 11:59
 */
public class Order {
    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

   /* public PayStatus pay(PayMent payMent){
        return payMent.pay(this.uid,this.amount);
    }*/

    /**
     * 解决了switch的过程，不需要代码中写swtich
     * 不需要写if else
     * @param payType
     * @return
     */
    public PayStatus pay(PayType payType) {
        return payType.get().pay(this.uid, this.amount);
    }



    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}



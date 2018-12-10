package com.gemini.pattern.observer.core;

import java.lang.reflect.Method;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.subject
 * @classname: Event
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:07
 */
public class Event {
    /**
     * 事件源
     */
    private Object source;

    /**
     * 目标
     */
    private Object target;


    /**
     * 回调
     */
    private Method callBack;

    /**
     * 触发器
     */
    private String trigger;

    /**
     * 时间
     */
    private Long time;

    public Event(Object target, Method callBack) {
        this.target = target;
        this.callBack = callBack;
    }



    void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallBack() {
        return callBack;
    }

    public void setCallBack(Method callBack) {
        this.callBack = callBack;
    }

    Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source='" + source + '\'' +"\n"+
                ", target=" + target +"\n"+
                ", callBack=" + callBack +"\n"+
                ", trigger='" + trigger + '\'' +"\n"+
                ", time=" + time +
                '}';
    }
}

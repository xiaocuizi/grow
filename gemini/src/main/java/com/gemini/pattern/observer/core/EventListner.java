package com.gemini.pattern.observer.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.subject
 * @classname: EventListner
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:13
 */
public class EventListner {

    protected Map<Enum, Event> events = new HashMap<Enum, Event>();

    public void addListenr(Enum eventType, Object target, Method callBack) {
        events.put(eventType, new Event(target, callBack));
    }

    private void trigger(Event e) {
        e.setSource(this);
        e.setTime(System.currentTimeMillis());
        try {
            e.getCallBack().invoke(e.getTarget(), e);
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }
    }

    protected void trigger(Enum call) {
        if (!this.events.containsKey(call)) {
            return;
        }
        trigger(this.events.get(call).setTrigger(call.toString()));

    }
}

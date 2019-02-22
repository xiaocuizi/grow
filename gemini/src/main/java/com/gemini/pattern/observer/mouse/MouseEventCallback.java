package com.gemini.pattern.observer.mouse;


import com.gemini.pattern.observer.core.Event;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.mouse
 * @classname: MouseEventCallback
 * @description: 回调响应的事件
 * @date 2018/12/7 12:34
 */
public class MouseEventCallback {

    public void onclick(Event event){
        System.out.println("MouseEventCallback:触发了鼠标单击事件........"+event.toString());
        System.out.println("MouseEventCallback:处理之后的业务逻辑.........");

    }

    public void up(Event event){
        System.out.println("MouseEventCallback:触发了鼠标向上事件........"+event);
    }


    public void down(Event event){
        System.out.println("MouseEventCallback:触发了鼠标向下事件........"+event);
    }

}

package com.gemini.pattern.observer.mouse;

import com.gemini.pattern.observer.core.EventListner;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.mouse
 * @classname: Mouse
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:32
 */
public class Mouse extends EventListner {
    public void click(){
        System.out.println("鼠标点击");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void doubleClick(){
        System.out.println("鼠标点击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

    public void up(){
        System.out.println("鼠标向上");
    }

    public void down(){
        System.out.println("鼠标向下");
    }
}

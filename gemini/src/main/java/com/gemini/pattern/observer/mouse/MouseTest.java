package com.gemini.pattern.observer.mouse;

import com.gemini.pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.mouse
 * @classname: MouseTest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:39
 */
public class MouseTest {

    public static void main(String[] args) {
             MouseEventCallback mouseEventCallback = new MouseEventCallback();
        try {
            Method onclick =  MouseEventCallback.class.getMethod("onclick", new Class[]{Event.class});
            Mouse mouse = new Mouse();
            mouse.addListenr(MouseEventType.ON_CLICK,mouseEventCallback,onclick);
            mouse.click();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

package com.gemini.pattern.observer.subject;

import com.gemini.pattern.observer.core.Event;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer.subject
 * @classname: ObServer
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:07
 */
public class ObServer {
    public  void  advice(Event event){
        System.out.println("触发事件，打印日志............."+event.toString());
    }
}

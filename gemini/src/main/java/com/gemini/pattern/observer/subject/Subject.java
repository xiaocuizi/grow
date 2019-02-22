package com.gemini.pattern.observer.subject;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.observer
 * @classname: Subject
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 12:02
 */
public class Subject {
    public void add(){
        System.out.println("调用添加方法..................");
    }

    public void remove(){
        System.out.println("调用删除方法..................");
    }
}

package com.gemini.pattern.proxy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.proxy
 * @classname: FatherProxtTeset
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/4 16:09
 */
public class FatherProxtTeset {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Father(son);
        father.findLove();
    }

}



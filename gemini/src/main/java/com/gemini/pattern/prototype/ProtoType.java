package com.gemini.pattern.prototype;

import java.util.ArrayList;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.prototype
 * @classname: ProtoType
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 11:16
 */
public class ProtoType implements Cloneable{
    public String name;
    public ArrayList list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



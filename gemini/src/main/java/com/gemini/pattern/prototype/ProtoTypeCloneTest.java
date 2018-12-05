package com.gemini.pattern.prototype;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.prototype
 * @classname: ProtoTypeCloneTest
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/5 11:20
 */
public class ProtoTypeCloneTest {

    public static void main(String[] args) {
         ProtoType protoType = new ProtoType();
         protoType.name = "大号";
         protoType.list.add("测试");
        try {
            ProtoType protoType1 = (ProtoType)protoType.clone();
            System.out.println(protoType1.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}



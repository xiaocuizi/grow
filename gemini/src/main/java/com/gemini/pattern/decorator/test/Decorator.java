package com.gemini.pattern.decorator.test;

import java.io.DataInputStream;
import java.io.InputStream;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.decorator.test
 * @classname: Decorator
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 10:38
 */
public class Decorator  {
    public static void main(String[] args) {
        InputStream intputStream = null;
        new DataInputStream(intputStream);
        DataInputStream  dataInputStream = new DataInputStream(intputStream);
    }
}

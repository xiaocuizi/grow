package com.gemini.pattern.proxy.cglib;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.proxy.cglib
 * @classname: CglibTest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/23 17:52
 */
public class CglibTest {

    public static void main(String[] args) {
        ZhangSan zhangSan = (ZhangSan) new CgLibMeipo().getInstance(ZhangSan.class);
        System.out.println(zhangSan.findLove());
    }
}

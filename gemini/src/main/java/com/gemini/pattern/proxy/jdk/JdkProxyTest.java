package com.gemini.pattern.proxy.jdk;

import com.gemini.pattern.proxy.Person;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @Package com.gemini.pattern.proxy.jdk
 * @classname: JdkProxyTest
 * @Description: todo (用一句话描述该文件做什么)
 * @date 2018/12/4 16:34
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        try {
            Person person = (Person)new JdkMeiPuo().getInstance(new XieMu());
            System.out.println(person.getClass());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



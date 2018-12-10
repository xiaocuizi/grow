package com.gemini.spring5.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.spring5.aop
 * @classname: IOCTest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/8 13:42
 */
public class IOCTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-application.xml");
        Object object = classPathXmlApplicationContext.getBean("bean");
    }
}

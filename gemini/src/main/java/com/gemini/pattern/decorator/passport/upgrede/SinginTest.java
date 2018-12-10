package com.gemini.pattern.decorator.passport.upgrede;

import com.gemini.pattern.decorator.passport.old.SingServiceImpl;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.decorator.passport.upgrede
 * @classname: SinginTest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 11:04
 */
public class SinginTest {
    public static void main(String[] args) {
      IsignThirdService isignThirdService = new SignThirdService(new SingServiceImpl());
       isignThirdService.loginQQ("xxxxxxxx");
        /**
         * decorator  Wrapper
         */
       /*
        * ============================================================================
        *           装饰器模式                       |       适配器模式
        * ------------------------------------------+---------------------------------
        * 是一种特别的适配器模式                     |   可以不保留层级关系
        * ------------------------------------------+---------------------------------
        * 装饰者和被装饰者实现了同一个接口           |   适配者和被适配者没有必然的层级关系
        * 主要为了扩展，依旧保留oop关系              |   通常采用代理或继承的形式进行包装
        * ------------------------------------------+----------------------------------
        * 满足is-a关系                               |  满足has -a关系
        * ------------------------------------------+----------------------------------
        * 注重覆盖和扩展                             | 注重兼容
        * ------------------------------------------+----------------------------------
        */
    }
}

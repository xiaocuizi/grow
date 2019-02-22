package com.gemini.pattern.proxy.jdk2;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.proxy.jdk2
 * @classname: IGPHelloImpl
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/7 16:20
 */
public class IGPHelloImpl implements IGPHello {
    /**
     *
     * @return
     */
    @Override
    public String sayHello() {
        System.out.println("(*´▽｀)ノノ，你好~~");
        return "nihao";
    }
}

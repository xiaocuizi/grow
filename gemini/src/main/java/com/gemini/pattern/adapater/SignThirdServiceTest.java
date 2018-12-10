package com.gemini.pattern.adapater;

import com.gemini.pattern.adapater.passport.SignThirdService;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.adapater
 * @classname: SignThirdServiceTest
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 13:08
 */
public class SignThirdServiceTest {

    public static void main(String[] args) {
        SignThirdService signThirdService = new SignThirdService();
        signThirdService.loginQQ("xxx");
    }
}

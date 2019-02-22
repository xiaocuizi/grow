package com.gemini.pattern.adapater.passport;

import com.gemini.pattern.adapater.ResultMsg;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.adapater.passport
 * @classname: SingService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 13:03
 */
public class SingService {


    /**
     * 注册
     * @param username
     * @param pwd
     */
    public ResultMsg register(String username, String pwd){
         return new ResultMsg(200,"注册成功",null);
    }


    /**
     * 登录
     * @param username
     * @param pwd
     */
    public ResultMsg login (String username,String pwd){
        return new ResultMsg(200,"登录成功",null);
    }
}

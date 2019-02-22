package com.gemini.pattern.decorator.passport.old;

import com.gemini.pattern.adapater.ResultMsg;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.decorator
 * @classname: ISingService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 10:29
 */
public interface ISingService{

    /**
     * 注册
     * @param username
     * @param pwd
     */
    public ResultMsg register(String username, String pwd);


    /**
     * 登录
     * @param username
     * @param pwd
     */
    public ResultMsg login (String username,String pwd);
}

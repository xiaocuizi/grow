package com.gemini.pattern.decorator.passport.upgrede;

import com.gemini.pattern.adapater.ResultMsg;
import com.gemini.pattern.decorator.passport.old.ISingService;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.decorator.passport.upgrede
 * @classname: SignThirdService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 11:01
 */
public class SignThirdService implements IsignThirdService {

    ISingService iSingService;

    public SignThirdService (ISingService singService){
        this.iSingService  = singService;
    }


    /**
     * 注册
     *
     * @param username
     * @param pwd
     */
    @Override
    public ResultMsg register(String username, String pwd) {
        return iSingService.register(username, pwd);
    }

    /**
     * 登录
     *
     * @param username
     * @param pwd
     */
    @Override
    public ResultMsg login(String username, String pwd) {
        return iSingService.login(username, pwd);
    }

    public ResultMsg loginQQ(String openId) {
        //openId，全局唯一，当做用户名
        //密码
        //注册
        ResultMsg resultMsg = this.getResultMsg(openId, null);
        return resultMsg;
    }


    public ResultMsg loginWechat(String openId) {
        ResultMsg resultMsg = this.getResultMsg(openId, null);
        return resultMsg;
    }

    private ResultMsg getResultMsg(String username, String pwd) {
        ResultMsg resultMsg = new ResultMsg(500, "处理失败",null);
        resultMsg = this.register(username, pwd);
        //调用原来的登录
        resultMsg = this.login(username, pwd);
        return resultMsg;
    }
}

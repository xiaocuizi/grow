package com.gemini.pattern.adapater.passport;

import com.gemini.pattern.adapater.ResultMsg;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.adapater.passport
 * @classname: SignThirdService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 13:05
 */
public class SignThirdService extends SingService {

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
        resultMsg = super.register(username, pwd);
        //调用原来的登录
        resultMsg = super.login(username, pwd);
        return resultMsg;
    }
}

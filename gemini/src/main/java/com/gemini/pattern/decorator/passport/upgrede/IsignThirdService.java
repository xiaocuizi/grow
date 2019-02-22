package com.gemini.pattern.decorator.passport.upgrede;

import com.gemini.pattern.adapater.ResultMsg;
import com.gemini.pattern.decorator.passport.old.ISingService;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.decorator.other
 * @classname: IsignThirdService
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/7 10:57
 */
public interface IsignThirdService extends ISingService {

    public ResultMsg loginQQ(String openId);


    public ResultMsg loginWechat(String openId);
}

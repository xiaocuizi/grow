package com.gemini.pattern.delegate.leader;

import com.gemini.map.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.delegate.leader
 * @classname: Leader
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 12:07
 */
public class Leader implements ITaget{

    private static Map<String,ITaget> targets = new HashMap<String,ITaget>();


    static {
        targets.put("加密",new TargetA());
        targets.put("登录",new TargetB());
    }
    /**
     * 做什么事情
     *
     * @param commamd
     */
    @Override
    public void doIng(String commamd) {
        targets.get(commamd).doIng(commamd);
    }
}

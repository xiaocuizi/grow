package com.gemini.pattern.delegate.leader;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.delegate.leader
 * @classname: TargetB
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/6 12:08
 */
public class TargetB implements ITaget{
    /**
     * 做什么事情
     *
     * @param commamd
     */
    @Override
    public void doIng(String commamd) {
        System.out.println("我是员工B，开始做"+commamd);
    }
}

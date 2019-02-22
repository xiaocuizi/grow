package com.gemini.pattern.lazy;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.pattern.lazy
 * @classname: LazyFour
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/30 17:42
 */
public class LazyFour {

    /**
     * 多线程时，保证volatile保证可见性
     */
    private volatile static  LazyFour instance;

    /**
     * 双重check
     * @return
     */
    public static LazyFour getInstance(){
        if(instance ==null){
            synchronized (LazyFour.class){
                if (instance ==null){
                    instance  = new LazyFour();
                }
            }
        }
        return instance;
    }


}

package com.gemini.threads.morethread;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: VolatileDemo1
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/22 17:04
 */
public class VolatileDemo1 {
   private  static  boolean init = false;

   private static  volatile  VolatileDemo1  instance;

    private VolatileDemo1(){
        synchronized (VolatileDemo1.class){
            if(init){
                throw new RuntimeException("实例化被入侵。。。。");
            }else {
                init = true;
            }
        }
    }

    public static synchronized VolatileDemo1 getInstance() {
       instance = new VolatileDemo1();
        return instance;
    }

}

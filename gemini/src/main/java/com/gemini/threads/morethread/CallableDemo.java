package com.gemini.threads.morethread;

import java.util.Date;
import java.util.concurrent.*;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread
 * @classname: CallableDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2018/12/20 21:33
 */
public class CallableDemo implements Callable<String> {

    public static void main(String[] args) {
        try {
            ExecutorService service =  Executors.newCachedThreadPool();
            CallableDemo   callableDemo = new CallableDemo();
            Future future =  service.submit(callableDemo);
            System.out.println("-------->"+future.get());//阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        return "hello"+new Date().getTime();
    }
}

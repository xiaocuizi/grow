package com.gemini.threads.java5;

import java.util.concurrent.*;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.java5
 * @classname: CallableDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/2/20 17:18
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future  = executorService.submit(new Callable<String>() {
            /**
             * Computes a result, or throws an exception if unable to do so.
             *
             * @return computed result
             * @throws Exception if unable to compute a result
             */
            @Override
            public String call() throws Exception {
                return "["+Thread.currentThread().getName()+"]Hello Wolds~~";
            }
        });

        String result = future.get();
        System.out.println("result="+result);
        executorService.shutdown();
    }
}

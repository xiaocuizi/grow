package com.gemini.threads.java5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.java5
 * @classname: ExecutorDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/2/20 17:10
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(1);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.printf("[线程%s] Hello,Worlds.~~",Thread.currentThread().getName());
            }
        });
        //一定要合理的关闭线程池哦
        if(executor instanceof ExecutorService){
            ExecutorService executorService =  ExecutorService.class.cast(executor);
            executorService.shutdown();
        }
    }
}

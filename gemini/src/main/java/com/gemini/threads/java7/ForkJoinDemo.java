package com.gemini.threads.java7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.java7
 * @classname: ForkJoinDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/2/20 18:23
 */
public class ForkJoinDemo {
    public static void main(String[] args) {
        //并行：也就是多核参与，
        // 并发：一同参与
        int num = ForkJoinPool.commonPool().getParallelism();
        System.out.println("当前CPU ForkJoin线程池，并行数 num="+num);
        int processors =Runtime.getRuntime().availableProcessors();
        System.out.println("processors="+processors);

        ForkJoinPool forkJoinPool = new ForkJoinPool();

       /* forkJoinPool.invoke(new ForkJoinTask<String>() {

            @Override
            public String getRawResult() {
                return null;
            }


            @Override
            protected void setRawResult(String value) {

            }


            @Override
            protected boolean exec() {
                return false;
            }
        });*/



        forkJoinPool.invoke(new RecursiveAction() {
            @Override
            protected void compute() {
                System.out.printf("[线程%s] Hello,Worlds.~~",Thread.currentThread().getName());
            }
        });

        forkJoinPool.shutdown();
    }
}

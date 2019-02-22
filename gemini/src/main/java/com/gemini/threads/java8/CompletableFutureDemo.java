package com.gemini.threads.java8;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.java8
 * @classname: CompletableFutureDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/2/20 19:17
 */
public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*CompletableFuture<String> completableFuture = new CompletableFuture<>();
        //有可能这个操作是子线程来完成
        completableFuture.complete("Hello Worlds");
        String val = completableFuture.get();
        System.out.println("val=" + val);*/

        /*CompletableFuture completableFuture =  CompletableFuture.runAsync(()->{
            System.out.println("Hello ,worlds");
        });
        //这里还是阻塞
        completableFuture.get();
        System.out.println("Statring 。。。。。");*/

        //supplyAsync异步,阻塞
        /*CompletableFuture completableFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello worlds";
            }
        });*/

       /* //lambda写法
        CompletableFuture<String> supplyAsyncCompletableFuture1 = CompletableFuture.supplyAsync(()->{
            //假设数据操作，来自于数据库
            //return "hello,Worlds2";
            return "["+Thread.currentThread().getName()+"]Hello Wolds~~";
        });

        String value = supplyAsyncCompletableFuture1.get();
        System.out.println("value = "+value);
        System.out.println("["+Thread.currentThread().getName()+"]start.......");*/


        CompletableFuture supplyAsyncCompletableFuture1 = CompletableFuture.supplyAsync(()->{
            //假设数据操作，来自于数据库
            //return "hello,Worlds2";
            return "["+Thread.currentThread().getName()+"]Hello Wolds~~";
        }).thenApply(v->{
            return v+"-来自于数据库";
        }).thenApply(v->{
            return v+ LocalDate.now();
        }).thenApply(v->{
            return v;
        }).thenRun(()->{
            System.out.println("操作结束。。。。。");
        }).exceptionally((e)->{
           e.printStackTrace();
            return null;
        });
        System.out.println("["+Thread.currentThread().getName()+"]start.......");

    }
}

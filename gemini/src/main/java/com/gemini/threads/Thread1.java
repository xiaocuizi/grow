package com.gemini.threads;

import java.util.Date;
import java.util.concurrent.*;

public class Thread1 implements Callable{

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Thread1 Thread1 = new Thread1();
        Future<String> stringFuture = executorService.submit(Thread1);
        try {
            System.out.println(stringFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
    @Override
    public Object call() throws Exception {
        return "str->"+ new Date().getTime();
    }
}

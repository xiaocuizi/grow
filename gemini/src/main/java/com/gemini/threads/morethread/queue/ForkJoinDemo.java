package com.gemini.threads.morethread.queue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.morethread.queue
 * @classname: ForkJoinDemo
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/1/2 17:49
 */
public class ForkJoinDemo extends RecursiveTask {

    private static final int THREADHOLD = 2;//阀值
    private int start;
    private int end;

    public ForkJoinDemo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Object compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THREADHOLD;
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (start + end) / 2;
            ForkJoinDemo leftTask = new ForkJoinDemo(start, middle);
            ForkJoinDemo rightTask = new ForkJoinDemo(middle + 1, end);
            leftTask.fork();
            rightTask.fork();
            int leftResult = (int) leftTask.join();
            int rightResult = (int) rightTask.join();
            //合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinDemo task = new ForkJoinDemo(1, 4);
        Future<Integer> future = forkJoinPool.submit(task);
        try {
            System.out.println("=========================");
            System.out.println(future.get());
            System.out.println("=========================");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

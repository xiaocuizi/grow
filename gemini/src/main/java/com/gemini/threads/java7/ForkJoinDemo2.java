package com.gemini.threads.java7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author xiaocuzi
 * @version v1.0.0
 * @package com.gemini.threads.java7
 * @classname: ForkJoinDemo2
 * @description: todo (用一句话描述该文件做什么)
 * @date 2019/2/20 18:37
 */
public class ForkJoinDemo2 {
    public static void main(String[] args) {
        //并行：也就是多核参与，
        // 并发：一同参与
        int num = ForkJoinPool.commonPool().getParallelism();
        System.out.println("当前CPU ForkJoin线程池，并行数 num="+num);
        int processors =Runtime.getRuntime().availableProcessors();
        System.out.println("processors="+processors);

        //并行计算
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        LongAdder longAdder = new LongAdder();
        forkJoinPool.invoke(new AddTask(list,longAdder));

        forkJoinPool.shutdown();
        System.out.println("longAdder->"+longAdder);
    }

    /**
     *
     */
    private static class AddTask extends RecursiveAction{
        private final List<Integer> nums;
        private final LongAdder longAdder;
        private AddTask(List<Integer> nums, LongAdder longAdder) {
            this.nums = nums;
            this.longAdder = longAdder;
        }

        @Override
        protected void compute() {
            int size = nums.size();
            //上
            //下

            if (size > 1) {
                int parts = size / 2;
                //左部分
                List<Integer> leftPart = nums.subList(0, parts);
                AddTask leftTask = new AddTask(leftPart, longAdder);
                //右部分
                List<Integer> rightPart = nums.subList(parts, size);
                AddTask rightTask = new AddTask(rightPart, longAdder);
                invokeAll(leftTask, rightTask);
            } else {
                if (size == 0) {
                    return;
                }
                Integer val = nums.get(0);
                longAdder.add(val.longValue());
            }
        }
    }
}

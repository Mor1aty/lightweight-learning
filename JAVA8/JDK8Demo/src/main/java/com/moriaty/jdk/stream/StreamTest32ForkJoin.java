package com.moriaty.jdk.stream;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * <p>
 * Stream 32 Fork Join
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/5 19:48
 */
public class StreamTest32ForkJoin {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SumRecursiveTask task = new SumRecursiveTask(1, 10000L);
        Long result = pool.invoke(task);
        System.out.println("result=" + result);
    }
}

class SumRecursiveTask extends RecursiveTask<Long> {

    /**
     * 拆分的临界值
     */
    private static final long THRESHOLD = 3000L;

    private final long start;

    private final long end;

    public SumRecursiveTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if (length <= THRESHOLD) {
            // 任务无需拆分
            long sum = 0;
            for (long i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("计算：" + start + "-->" + end + ", 的结果为：" + sum);
            return sum;
        } else {
            long middle = (start + end) / 2;
            System.out.println("拆分：左边 " + start + "-->右边：" + end);
            SumRecursiveTask left = new SumRecursiveTask(start, middle);
            left.fork();
            SumRecursiveTask right = new SumRecursiveTask(middle + 1, end);
            right.fork();
            return left.join() + right.join();
        }
    }
}

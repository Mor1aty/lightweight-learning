package com.moriaty.jdk.stream;


import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 30 Compare
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest30Compare {

    public static void main(String[] args) {
        long times = 500000000;

        System.out.println("普通 for 循环");
        long start = System.currentTimeMillis();
        System.out.println(start);
        long res = 0;
        for (int i = 0; i < times; i++) {
            res += i;
        }
        System.out.println(res);
        System.out.println(System.currentTimeMillis() - start);


        System.out.println("串行流 for 循环");
        LongStream longStream = LongStream.rangeClosed(0, times);
        start = System.currentTimeMillis();
        System.out.println(longStream.reduce(0, Long::sum));
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("并行流 for 循环");
        longStream = LongStream.rangeClosed(0, times);
        start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(longStream.parallel().reduce(0, Long::sum));
        System.out.println(System.currentTimeMillis() - start);

    }
}

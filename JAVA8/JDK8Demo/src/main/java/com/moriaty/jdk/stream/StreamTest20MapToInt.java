package com.moriaty.jdk.stream;


import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 20 MapToInt
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest20MapToInt {
    public static void main(String[] args) {
        // Integer 占用的内存比 int 多，在 Stream 流操作中会自动装箱和拆箱操作
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        Stream.of(arr)
                .filter(i -> i > 0)
                .forEach(System.out::println);
        // 为了提高效率，可以将流中的 Integer 转化为 int
        IntStream intStream = Stream.of(arr).mapToInt(Integer::intValue);
        intStream.filter(i -> i > 3)
                .forEach(System.out::println);
    }
}

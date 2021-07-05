package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 13 Sorted
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest13Sorted {
    public static void main(String[] args) {
        Stream.of("1", "3", "2", "0", "11", "6", "4")
                .map(Integer::parseInt)
                // 根据数据自然排序
                .sorted()
                // 根据比较器排序
                .sorted((o1, o2) -> o2 - o1)
                .forEach(System.out::println);
    }
}

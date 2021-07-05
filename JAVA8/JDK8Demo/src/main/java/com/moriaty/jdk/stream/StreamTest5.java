package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 5
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest5 {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "a3");
        String[] arr1 = {"aa", "bb", "cc"};
        Stream<String> arr11 = Stream.of(arr1);
        arr11.forEach(System.out::println);

        Integer[] arr2 = {1, 2, 3, 4};
        Stream<Integer> arr21 = Stream.of(arr2);
        arr21.forEach(System.out::println);

        // 注意：基本数据类型的数组是不行的
        int[] arr3 = {1, 2, 3, 4};
        Stream<int[]> arr31 = Stream.of(arr3);
        arr31.forEach(System.out::println);
    }
}

package com.moriaty.stream;

import java.util.stream.Stream;

/**
 * <p>
 * StreamDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 18:42
 */
public class StreamDemo {

    public static void main(String[] args) {
        testTakeWhile();
        System.out.println();
        testDropWhile();
        System.out.println();
        testOfNullable();
    }

    public static void testTakeWhile() {
        // 从 Stream 中依次获取满足条件的元素，直到不满足条件为止结束获取。只要遇到第一个不满足条件的元素马上停止获取。
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 7, 60);
        stream.takeWhile(num -> num < 50)
                .forEach(num -> System.out.print(num + ","));
    }

    public static void testDropWhile() {
        // 从 Stream 依次删除满足条件的元素，直到不满足条件为止结束删除。
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 7, 60);
        stream.dropWhile(num -> num < 50)
                .forEach(num -> System.out.print(num + ","));
    }

    public static void testOfNullable() {
        /*
        JAVA8 中 Stream 不能完全为 null（一个元素不能为 null，多个元素可以存在 null），
        否则会报空指针异常。而 JAVA9 中的 `ofNullable` 方法允许我们创建一个单元素 Stream，
        可以包含一个非空元素，也可以创建一个空 Stream。
         */
        System.out.println(Stream.ofNullable(null).count());
    }
}

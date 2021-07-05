package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 12 Map
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest12Map {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "4", "5", "6", "7")
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}

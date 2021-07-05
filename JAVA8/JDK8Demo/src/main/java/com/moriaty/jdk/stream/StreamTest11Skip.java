package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 11 Skip
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest11Skip {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "b3")
                .skip(2)
                .forEach(System.out::println);
    }
}

package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 9 Filter
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest9Filter {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "b3")
                .filter(s -> s.contains("a"))
                .forEach(System.out::println);
    }
}

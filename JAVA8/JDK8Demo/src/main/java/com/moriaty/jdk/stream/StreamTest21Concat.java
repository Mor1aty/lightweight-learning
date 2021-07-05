package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 21 Concat
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest21Concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("x", "y", "z");
        Stream.concat(stream1, stream2)
                .forEach(System.out::println);
    }
}

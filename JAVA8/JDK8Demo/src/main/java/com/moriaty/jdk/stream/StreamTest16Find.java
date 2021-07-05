package com.moriaty.jdk.stream;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 16 Find
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest16Find {
    public static void main(String[] args) {
        Optional<String> first = Stream.of("1", "3", "3", "3", "11", "6", "4")
                .findFirst();
        System.out.println(first.get());
        Optional<String> any = Stream.of("1", "3", "3", "3", "11", "6", "4")
                .findAny();
        System.out.println(any.get());

    }
}

package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 8 Count
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest8Count {
    public static void main(String[] args) {
        long count = Stream.of("a1", "a2", "b3").count();
        System.out.println(count);
    }
}

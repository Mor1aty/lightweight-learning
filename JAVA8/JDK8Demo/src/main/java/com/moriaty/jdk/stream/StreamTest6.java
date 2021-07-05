package com.moriaty.jdk.stream;


import java.util.stream.Stream;

/**
 * <p>
 * Stream 6
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a1", "a2", "a3");
        a1.filter(s -> {
            System.out.println("-------");
            return s.contains("a");
        });

    }
}

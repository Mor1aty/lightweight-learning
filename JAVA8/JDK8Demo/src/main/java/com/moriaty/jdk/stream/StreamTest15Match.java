package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.stream.Stream;

/**
 * <p>
 * Stream 15 Match
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest15Match {
    public static void main(String[] args) {
        System.out.println(Stream.of("1", "3", "3", "3", "11", "6", "4")
                .map(Integer::parseInt)
                .allMatch(s -> s > 0));
        System.out.println(Stream.of("1", "3", "3", "3", "11", "6", "4")
                .map(Integer::parseInt)
                .anyMatch(s -> s > 4));
        System.out.println(Stream.of("1", "3", "3", "3", "11", "6", "4")
                .map(Integer::parseInt)
                .noneMatch(s -> s > 4));
    }
}

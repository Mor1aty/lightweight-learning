package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 29 Parallel
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest29Parallel {

    public static void main(String[] args) {
        // 串行流
        System.out.println(Stream.of(5, 6, 8, 10, 2)
                .filter(s -> {
                    System.out.println(Thread.currentThread().getName() + ":" + s);
                    return s > 3;
                })
                .count());

        // 并行流
        System.out.println(Stream.of(1, 4, 2, 6, 1, 5)
                .parallel()
                .filter(s -> {
                    System.out.println(Thread.currentThread().getName() + ":" + s);
                    return s > 2;
                }).count());

    }
}

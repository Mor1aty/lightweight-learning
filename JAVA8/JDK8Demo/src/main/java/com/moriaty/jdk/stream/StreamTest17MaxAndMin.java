package com.moriaty.jdk.stream;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 17 Max And Min
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest17MaxAndMin {
    public static void main(String[] args) {
        Optional<Integer> max = Stream.of("1", "3", "3", "4", "5", "1", "7")
                .map(Integer::parseInt)
                .max((o1, o2) -> (o1 - o2));
        System.out.println(max.get());

        Optional<Integer> min = Stream.of("1", "3", "3", "4", "5", "1", "7")
                .map(Integer::parseInt)
                .min((o1, o2) -> (o1 - o2));
        System.out.println(min.get());
    }
}

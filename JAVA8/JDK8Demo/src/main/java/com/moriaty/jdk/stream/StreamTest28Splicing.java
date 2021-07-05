package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 28 Splicing
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest28Splicing {

    public static void main(String[] args) {
        String s1 = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 18, 165),
                new Person("李四", 15, 166),
                new Person("张三", 19, 182))
                .map(Person::getName)
                .collect(Collectors.joining());
        System.out.println(s1);

        String s2 = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 18, 165),
                new Person("李四", 15, 166),
                new Person("张三", 19, 182))
                .map(Person::getName)
                .collect(Collectors.joining("_"));
        System.out.println(s2);

        String s3 = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 18, 165),
                new Person("李四", 15, 166),
                new Person("张三", 19, 182))
                .map(Person::getName)
                .collect(Collectors.joining("_", "###","$$$"));
        System.out.println(s3);
    }
}

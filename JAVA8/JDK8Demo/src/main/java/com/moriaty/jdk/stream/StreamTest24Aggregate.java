package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 24 Aggregate
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest24Aggregate {

    public static void main(String[] args) {
        // 获取年龄的最大值
        Optional<Person> maxAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .collect(Collectors.maxBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println(maxAge.get());

        Optional<Person> minAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .collect(Collectors.minBy((p1, p2) -> p1.getAge() - p2.getAge()));
        System.out.println(minAge.get());

        Integer sumAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .collect(Collectors.summingInt(s -> s.getAge()));
        System.out.println(sumAge);

        Double avgAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .collect(Collectors.averagingInt(Person::getAge));
        System.out.println(avgAge);

        Long count = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .collect(Collectors.counting());
        System.out.println(count);
    }
}

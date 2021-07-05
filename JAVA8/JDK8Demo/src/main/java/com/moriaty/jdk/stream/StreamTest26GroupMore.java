package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 26 Group More
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest26GroupMore {

    public static void main(String[] args) {
        Map<String, Map<String, List<Person>>> map1 = Stream.of(
                new Person("张三", 18, 175),
                new Person("李四", 22, 177),
                new Person("张三", 18, 165),
                new Person("李四", 15, 166),
                new Person("张三", 19, 182))
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.groupingBy(p -> p.getAge() >= 18 ? "成年" : "未成年")));
        map1.forEach((k, v) -> {
            System.out.println(k + ":");
            v.forEach((kk, vv) -> System.out.println("  " + kk + "=" + vv));
        });
    }
}

package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.security.Permission;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 14 Distinct
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest14Distinct {
    public static void main(String[] args) {
        Stream.of("1", "3", "3", "0", "11", "6", "4")
                .map(Integer::parseInt)
                // 根据数据自然排序
                .sorted()
                // 根据比较器排序
                .sorted((o1, o2) -> o2 - o1)
                // 去掉重复记录
                .distinct()
                .forEach(System.out::println);
        Stream.of(
                new Person("张三", 18),
                new Person("李四", 19),
                new Person("张三", 18)
        ).distinct()
                .forEach(System.out::println);
    }
}

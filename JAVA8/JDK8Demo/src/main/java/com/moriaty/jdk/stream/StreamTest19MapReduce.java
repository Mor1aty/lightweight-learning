package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.stream.Stream;

/**
 * <p>
 * Stream 19 MapReduce
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest19MapReduce {
    public static void main(String[] args) {
        // 求出所有年龄的总和
        Integer sumAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                // 实现类型转换
                .map(Person::getAge)
                .reduce(0, Integer::sum);
        System.out.println(sumAge);

        // 求出所有年龄中的最大值
        Integer maxAge = Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("王五", 13),
                new Person("赵柳", 15),
                new Person("周期", 19))
                .map(Person::getAge)
                .reduce(0, Math::max);
        System.out.println(maxAge);

        // 统计字符 a 出现的次数
        Integer count = Stream.of("a", "a", "c", "d", "a", "c", "a")
                .map(ch -> "a".equals(ch) ? 1 : 0)
                .reduce(0, Integer::sum);
        System.out.println(count);
    }
}

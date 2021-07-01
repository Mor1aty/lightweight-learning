package com.moriaty.jdk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Stream 2
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三风", "李四", "王五无");

        // 获取所有姓张的信息
        // 获取所有姓名长度为 3 的用户
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
        .forEach(System.out::println);

    }
}

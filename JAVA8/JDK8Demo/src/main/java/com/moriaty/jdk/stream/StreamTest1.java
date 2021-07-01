package com.moriaty.jdk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Stream 1
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三", "李四", "王五无");

        // 获取所有姓张的信息
        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }

        // 获取所有姓名长度为 3 的用户
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}

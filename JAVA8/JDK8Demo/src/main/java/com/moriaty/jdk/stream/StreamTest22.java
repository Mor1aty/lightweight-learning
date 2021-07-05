package com.moriaty.jdk.stream;


import com.moriaty.jdk.lambda.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 22
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest22 {
    /**
     * 1. 第一个队伍只保留姓名长度为 3 的成员
     * 2. 第一个队伍筛选之后只要前 3 个人
     * 3. 第二个队伍只要姓张的队员
     * 4. 第二个队伍筛选之后不要前两个人
     * 5. 将两个队伍合并成一个
     * 6. 根据姓名创建 Person 对象
     * 7. 打印这个队伍的 Person 信息
     */
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七 公");
        List<String> list2 = Arrays.asList("古力娜扎", "张无忌", "张三丰", "赵丽颖", "张二狗", "张天爱", "张三");

        // 1. 第一个队伍只保留姓名长度为 3 的成员
        // 2. 第一个队伍筛选之后只要前 3 个人
        Stream<String> stream1 = list1.stream()
                .filter(s -> s.length() == 3)
                .limit(3);

        // 3. 第二个队伍只要姓张的队员
        // 4. 第二个队伍筛选之后不要前两个人
        Stream<String> stream2 = list2.stream()
                .filter(s -> s.startsWith("张"))
                .skip(2);

        // 5. 将两个队伍合并成一个
        // 6. 根据姓名创建 Person 对象
        // 7. 打印这个队伍的 Person 信息
        Stream.concat(stream1, stream2)
                .map(Person::new)
                .forEach(System.out::println);
    }
}

package com.moriaty.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * CollectionDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 18:34
 */
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = List.of("张三", "李四", "王五");
        System.out.println(list);
        Set<String> set = Set.of("张三", "李四", "王五");
        System.out.println(set);
        Map<Integer, String> map = Map.of(1, "张三", 2, "李四", 3, "张三");
        System.out.println(map);

        // 修改只读集合的内容
        list.add("aa");
    }
}

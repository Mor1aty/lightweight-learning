package com.moriaty.newapis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * APITest
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/15 12:04
 */
public class ApiTest {

    /**
     * 集合中的增加 API
     */
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        System.out.println(list);
    }

    @Test
    public void test2() {

        // asList 产生 List
        List<String> list1 = Arrays.asList("11", "22", "33");
        System.out.println(list1);

        // 集合的创建可以使用更简单的方法
        List<String> list2 = List.of("aa", "bb", "cc", "dd");
        System.out.println(list2);

        // 上面二者都不可以添加参数
    }

    @Test
    public void test3() {

        // 添加重复数据会抛出异常
        Set<String> set = Set.of("a", "b");
        System.out.println(set);

        // of 方法通常是在创建对象
    }

}

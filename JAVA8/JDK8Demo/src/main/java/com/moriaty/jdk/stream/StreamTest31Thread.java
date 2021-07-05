package com.moriaty.jdk.stream;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * <p>
 * Stream 31 Thread
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest31Thread {

    public static void main(String[] args) {
        // 并行流中的数据安全问题
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        // 使用并行流向集合中添加数据
        List<Integer> newList = new ArrayList<>();

//        list.parallelStream().forEach(newList::add);
        // 加锁
        Object o = new Object();
        list.parallelStream().forEach(s -> {
            synchronized (o) {
                newList.add(s);
            }
        });
        System.out.println(newList.size());

        // 使用线程安全的容器
        Vector<Integer> vector = new Vector<>();
        list.parallelStream().forEach(vector::add);
        System.out.println(vector.size());
    }
}

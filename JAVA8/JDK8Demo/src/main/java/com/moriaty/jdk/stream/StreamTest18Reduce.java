package com.moriaty.jdk.stream;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 18 Reduce
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest18Reduce {
    public static void main(String[] args) {
        Integer total = Stream.of(4, 5, 3, 9)
                // identity 默认值
                // 第一次会将默认值赋值给 x
                // 之后每一次都会将上一次操作结果赋值给 x, y 是每次从数据中获取的元素
                .reduce(0, (x, y) -> {
                    System.out.println("x=" + x + ", y=" + y);
                    return x + y;
                });
        System.out.println(total);

        Integer max = Stream.of(4, 5, 3, 9)
                .reduce(0, (x, y) ->
                        x > y ? x : y
                );
        System.out.println(max);
    }
}

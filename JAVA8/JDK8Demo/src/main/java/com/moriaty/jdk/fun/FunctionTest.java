package com.moriaty.jdk.fun;

import java.util.function.Function;

/**
 * <p>
 * Function
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 16:42
 */
public class FunctionTest {
    public static void main(String[] args) {
        test(msg -> {
            return Integer.parseInt(msg);
        });

        test2(msg -> {
            return Integer.parseInt(msg);
        }, msg2 -> {
            return msg2 * 10;
        });
    }

    public static void test(Function<String, Integer> function) {
        Integer apply = function.apply("666");
        System.out.println("apply = " + apply);
    }

    public static void test2(Function<String, Integer> f1, Function<Integer, Integer> f2) {
        Integer apply = f1.andThen(f2).apply("666");
        System.out.println("apply = " + apply);
    }
}

package com.moriaty.jdk.funref;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <p>
 * 方法引用 4
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:35
 */
public class FunctionRefTest04 {
    public static void main(String[] args) {
        Function<String, Integer> function = (s) -> {
            return s.length();
        };
        System.out.println(function.apply("Hello"));

        // 通过方法引用来实现
        Function<String, Integer> function1 = String::length;
        System.out.println(function1.apply("Hello"));

        BiFunction<String, Integer, String> function2 = String::substring;
        System.out.println(function2.apply("HelloWorld", 3));
    }

}

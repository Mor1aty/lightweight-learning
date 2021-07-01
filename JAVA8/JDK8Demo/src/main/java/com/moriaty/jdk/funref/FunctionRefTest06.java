package com.moriaty.jdk.funref;

import com.moriaty.jdk.lambda.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <p>
 * 方法引用 6
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:35
 */
public class FunctionRefTest06 {
    public static void main(String[] args) {
        Function<Integer, String[]> function1 = (len) -> {
            return new String[len];
        };
        System.out.println(function1.apply(4).length);

        // 方法引用
        Function<Integer, String[]> function2 = String[]::new;
        System.out.println(function2.apply(10).length);
    }

}

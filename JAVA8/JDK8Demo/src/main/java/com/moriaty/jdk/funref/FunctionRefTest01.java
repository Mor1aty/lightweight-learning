package com.moriaty.jdk.funref;

import java.util.function.Consumer;

/**
 * <p>
 * 方法引用 1
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:21
 */
public class FunctionRefTest01 {
    public static void main(String[] args) {
        // :: 方法引用
        printSum(FunctionRefTest01::getTotal);
    }

    public static void getTotal(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    private static void printSum(Consumer<int[]> consumer) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        consumer.accept(arr);
    }
}

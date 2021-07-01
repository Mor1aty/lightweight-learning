package com.moriaty.jdk.fun;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * <p>
 * Supplier 函数式接口使用
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 15:38
 */
public class SupplierTest {

    public static void main(String[] args) {
        func1(() -> {
            int[] arr = {22, 33, 44, 55, 1, 2, 909, 2100};
            // 计算出数组中的最大值
            Arrays.sort(arr);
            return arr[arr.length - 1];
        });
    }

    private static void func1(Supplier<Integer> supplier) {
        // get 是一个无参数有返回值的抽象方法
        Integer max = supplier.get();
        System.out.println("max = " + max);
    }
}

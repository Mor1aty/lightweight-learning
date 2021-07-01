package com.moriaty.jdk.funref;

import java.util.Date;
import java.util.function.Supplier;

/**
 * <p>
 * 方法引用 3
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:35
 */
public class FunctionRefTest03 {
    public static void main(String[] args) {
        Supplier<Long> supplier = () -> {
            return System.currentTimeMillis();
        };
        System.out.println(supplier.get());

        // 通过方法引用实现
        Supplier<Long> supplier1 = System::currentTimeMillis;
        System.out.println(supplier1.get());

    }

}

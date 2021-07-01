package com.moriaty.jdk.funref;

import java.util.Date;
import java.util.function.Supplier;

/**
 * <p>
 * 方法引用 2
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:35
 */
public class FunctionRefTest02 {
    public static void main(String[] args) {
        Date now = new Date();
        Supplier<Long> supplier = () -> now.getTime();
        System.out.println(supplier.get());

        // 通过方法引用使用
        Supplier<Long> supplier1 = now::getTime;
        System.out.println(supplier1.get());
    }

}

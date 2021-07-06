package com.moriaty.jdk.optional;

import java.util.Optional;

/**
 * <p>
 * Optional 01
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 10:57
 */
public class OptionalTest01 {
    public static void main(String[] args) {
        // of 方法不支持传入 null
        Optional<String> op1 = Optional.of("张三");
        Optional<Object> op2 = Optional.of(null);

        // ofNullable 支持 null
        Optional<String> op3 = Optional.ofNullable("lisi");
        Optional<Object> op4 = Optional.ofNullable(null);

        // empty 直接创建空对象
        Optional<Object> op5 = Optional.empty();
    }
}

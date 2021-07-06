package com.moriaty.jdk.optional;

import java.util.Optional;

/**
 * <p>
 * Optional 02
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 10:57
 */
public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("张三");
        Optional<String> op2 = Optional.empty();

        /*
         获取 Optional 的值：get()
         */
        System.out.println(op1.get());
        // get 方法没有值会抛出 NoSuchElementException 异常

        /*
         判断是否有值：isPresent()
         */
        if (op2.isPresent()) {
            System.out.println("空");
        }

        /*
        赋予默认值：orElse()
        如果是空值，则返回 orElse 的值
         */
        System.out.println(op2.orElse("王五"));

        /*
        orElseGet()
        与 orElse() 方法类似
         */
        System.out.println(op2.orElseGet(() -> "hello"));

    }
}

package com.moriaty.jdk.fun;

import java.util.function.Predicate;

/**
 * <p>
 * Predicate
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 16:58
 */
public class PredicateTest {
    public static void main(String[] args) {
        test(msg -> {
            return msg.length() > 3;
        }, "a");

        test2(msg1 -> {
            return msg1.contains("H");
        }, msg2 -> {
            return msg2.contains("W");
        });
    }

    private static void test(Predicate<String> predicate, String msg) {
        boolean b = predicate.test(msg);
        System.out.println("b = " + b);
    }

    private static void test2(Predicate<String> p1, Predicate<String> p2) {
        boolean b1 = p1.and(p2).test("Hello");
        boolean b2 = p1.or(p2).test("Hello");
        boolean b3 = p1.negate().test("Hello");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

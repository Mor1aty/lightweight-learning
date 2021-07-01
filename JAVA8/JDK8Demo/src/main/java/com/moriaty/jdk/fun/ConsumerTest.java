package com.moriaty.jdk.fun;

import java.util.Locale;
import java.util.function.Consumer;

/**
 * <p>
 * Consumer
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 16:29
 */
public class ConsumerTest {

    public static void main(String[] args) {
        test(msg -> {
            System.out.println(msg + " -> " + msg.toLowerCase(Locale.ROOT));
        });

        test2(msg1 -> {
            System.out.println(msg1 + " -> " + msg1.toLowerCase(Locale.ROOT));
        }, msg2 -> {
            System.out.println(msg2 + " -> " + msg2.toUpperCase(Locale.ROOT));
        });

        test3(msg1 -> {
            System.out.println(msg1 + " -> " + msg1.toLowerCase(Locale.ROOT));
        }, msg2 -> {
            System.out.println(msg2 + " -> " + msg2.toUpperCase(Locale.ROOT));
        });
    }

    public static void test(Consumer<String> consumer) {
        consumer.accept("Hello World");
    }

    public static void test2(Consumer<String> c1, Consumer<String> c2) {
        String str = "Hello World";
        // 转小写
        c1.accept(str);
        // 转大写
        c2.accept(str);
    }

    public static void test3(Consumer<String> c1, Consumer<String> c2) {
        String str = "Hello World";
        c1.andThen(c2).accept(str);
    }
}

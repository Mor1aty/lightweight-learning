package com.moriaty.jdk.funref;

import com.moriaty.jdk.lambda.domain.Person;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <p>
 * 方法引用 5
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:35
 */
public class FunctionRefTest05 {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> {
            return new Person();
        };
        System.out.println(supplier.get());

        // 通过方法引用来实现
        Supplier<Person> supplier1 = Person::new;
        System.out.println(supplier1.get());

        BiFunction<String, Integer, Person> function = Person::new;
        System.out.println(function.apply("张三", 13));
    }

}

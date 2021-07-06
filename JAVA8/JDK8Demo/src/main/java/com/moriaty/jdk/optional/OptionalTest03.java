package com.moriaty.jdk.optional;

import com.moriaty.jdk.lambda.domain.Person;

import java.util.Locale;
import java.util.Optional;

/**
 * <p>
 * Optional 03
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 10:57
 */
public class OptionalTest03 {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.of("张三");

        /*
        ifPresent
         如果存在值，就做什么
         */
        op1.ifPresent(System.out::println);

        /*
        自定义一个方法，将 Person 对象中的 name 转换为大写，并返回
         */
        Person p = new Person("zhansan", 18);
        Optional<Person> op = Optional.of(p);
        System.out.println(getName(p));
        System.out.println(getNameForOptional(op));

    }

    private static String getNameForOptional(Optional<Person> op) {
        String res = null;
        if (op.isPresent()) {
            return op.map(Person::getName)
                    .map(String::toUpperCase)
                    .orElse(null);
        }
        return res;
    }

    private static String getName(Person person) {
        if (person != null) {
            String name = person.getName();
            if (name != null) {
                return name.toUpperCase(Locale.ROOT);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}

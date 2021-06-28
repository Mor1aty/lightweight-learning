package com.moriaty.jdk.lambda;

import com.moriaty.jdk.lambda.service.OrderService;
import com.moriaty.jdk.lambda.service.StudentService;
import com.moriaty.jdk.lambda.service.UserService;

/**
 * <p>
 * Lambda Demo4
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/28 17:14
 */
public class Demo04Lambda {

    public static void main(String[] args) {
        goStudent((String name, Integer age) -> {
            return name + age + " 666666";
        });

        // 省略写法
        goStudent((name, age) -> name + age + " 666666");

        goOrder((String name) -> {
            System.out.println(name);
            return 22;
        });

        // 省略写法
        goOrder(name -> 222);
    }

    public static void goStudent(StudentService studentService) {
        studentService.show("张三", 22);
    }

    public static void goOrder(OrderService orderService) {
        orderService.show("李四");
    }
}

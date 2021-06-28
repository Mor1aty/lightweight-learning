package com.moriaty.jdk.lambda;

import com.moriaty.jdk.lambda.service.UserService;

/**
 * <p>
 * Lambda Demo2
 * </p>
 *
 * @author Moriaty
 * @since 2021/6/28 17:14
 */
public class Demo02Lambda {

    public static void main(String[] args) {
        goShow(new UserService() {
            @Override
            public void show() {
                System.out.println("show 方法执行了");
            }
        });
        System.out.println("---------------------");
        goShow(() -> {
            System.out.println("lambda show 执行了");
        });
        System.out.println("---------------------");
        goShow(() -> System.out.println("lambda show 1 方法执行了"));
    }

    public static void goShow(UserService userService) {
        userService.show();
    }
}

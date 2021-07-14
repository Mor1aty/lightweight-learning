package com.moriaty.var;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * <p>
 * VarDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 11:58
 */
public class VarDemo {
    /**
     * 1. 只针对局部变量
     * 2. var 是保留类型，不是关键字。意味着我们还可以用 var 来定义变量名或者是方法名
     * 3. var 不允许赋值为 null
     * 4. var 不能定义方法参数的，因为没有值无法进行类型推断
     *
     * @param args String
     */
    public static void main(String[] args) {
        var i = 1;
        System.out.println(i);

        var s = "123";
        System.out.println(s);

        var list = new ArrayList<String>();
        list.add("123");
        for (var ss : list) {
            System.out.println(ss);
        }

        var map = new HashMap<String, String>();
        map.put("test", "tt");
        for (var elem : map.entrySet()) {
            System.out.println(elem);
        }

        var user = new User();
        user.setAge("12");
        user.setName("张三");

        System.out.println(user);

        // var aa = null;

    }
}

class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
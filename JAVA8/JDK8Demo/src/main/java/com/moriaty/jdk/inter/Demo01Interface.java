package com.moriaty.jdk.inter;

/**
 * <p>
 * 接口 Demo 1
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 11:19
 */
public class Demo01Interface {
    public static void main(String[] args) {
        A b = new B();
        A c = new C();
        b.test3();
        c.test3();
        A.test4();
    }
}

interface A {
    void test1();

    /**
     * 在接口中新增抽象方法，所有实现类都需要重写该方法，不利于接口的扩展
     */
    void test2();

    default String test3() {
        System.out.println("接口中的默认方法执行");
        return "test3";
    }

    /**
     * 接口 中的静态方法
     */
    static String test4() {
        System.out.println("接口中的静态方法执行");
        return "test4";
    }
}

class B implements A {
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public String test3() {
        System.out.println("B 实现类中重写了默认方法");
        return "ok";
    }
}

class C implements A {

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}


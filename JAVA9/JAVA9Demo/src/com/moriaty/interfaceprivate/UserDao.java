package com.moriaty.interfaceprivate;

/**
 * <p>
 * 接口中的私有方法
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 17:33
 */
public interface UserDao {
    /**
     * common
     * 私有方法只允许接口调用，其他类和实现类都不能调用
     */
    private void common() {
        System.out.println("common");
    }

    /**
     * show
     */
    default void show() {
        common();
    }
}

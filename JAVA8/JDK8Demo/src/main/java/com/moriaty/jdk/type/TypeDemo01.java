package com.moriaty.jdk.type;

/**
 * <p>
 * Type 01
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 14:30
 */
public class TypeDemo01<@TypeParam T> {
    public <@TypeParam K extends Object> K test01() {
        return null;
    }
}

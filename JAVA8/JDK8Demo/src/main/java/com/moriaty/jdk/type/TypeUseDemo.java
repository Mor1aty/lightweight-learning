package com.moriaty.jdk.type;

/**
 * <p>
 * TYPE USE
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 14:35
 */
public class TypeUseDemo {
    public @NotNull Integer age = 10;

    public Integer sum(@NotNull Integer a, @NotNull Integer b) {
        return a + b;
    }
}

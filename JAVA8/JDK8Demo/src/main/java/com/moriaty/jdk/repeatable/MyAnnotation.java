package com.moriaty.jdk.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 * Repeatable
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 14:23
 */
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value();
}

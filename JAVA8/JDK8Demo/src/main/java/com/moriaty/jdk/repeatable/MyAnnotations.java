package com.moriaty.jdk.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 * Repeatable
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 14:22
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotations {

    MyAnnotation[] value();
}

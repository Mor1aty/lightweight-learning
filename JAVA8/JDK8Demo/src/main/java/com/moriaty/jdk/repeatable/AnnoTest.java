package com.moriaty.jdk.repeatable;

/**
 * <p>
 * Repeatable
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 14:25
 */

@MyAnnotation("t1")
@MyAnnotation("t2")
@MyAnnotation("t3")
public class AnnoTest {
    public static void main(String[] args) {
        // 解析重复注解
        MyAnnotation[] annotationsByType = AnnoTest.class.getAnnotationsByType(MyAnnotation.class);
        for (MyAnnotation myAnnotation : annotationsByType) {
            System.out.println(myAnnotation.value());
        }
    }
}

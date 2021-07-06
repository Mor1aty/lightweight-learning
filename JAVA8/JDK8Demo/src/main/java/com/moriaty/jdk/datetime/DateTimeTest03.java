package com.moriaty.jdk.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * DateTime 03
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest03 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        // 修改日期时间
        // 会创建一个新的 LocalDateTime，并不会修改原来的信息
        System.out.println(now);
        System.out.println(now.withYear(1998));

        // 在当前日期时间的基础上，加上或者减去指定时间
        System.out.println(now.plusDays(2));
        System.out.println(now.minusDays(2));

        // 比较日期
        LocalDate now1 = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 1, 3);
        System.out.println(now1.isAfter(date));
        System.out.println(now1.isBefore(date));
        System.out.println(now1.isEqual(date));
    }
}

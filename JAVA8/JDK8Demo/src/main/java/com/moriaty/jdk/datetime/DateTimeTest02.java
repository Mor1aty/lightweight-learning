package com.moriaty.jdk.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * <p>
 * DateTime 02
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest02 {
    public static void main(String[] args) {

        // 创建指定的日期
        System.out.println(LocalDate.of(2021, 7, 1));

        // 获取当前日期
        System.out.println(LocalDate.now());

        // 根据 LocalDate 对象获取对应的日期信息
        LocalDate now = LocalDate.now();
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfWeek().getValue());

        // 得到指定的时间
        System.out.println(LocalTime.of(5, 26, 33, 122));

        // 获取当前时间
        System.out.println(LocalTime.now());

        // 获取时间信息
        LocalTime now1 = LocalTime.now();
        System.out.println(now1.getHour());
        System.out.println(now1.getMinute());
        System.out.println(now1.getSecond());
        System.out.println(now1.getNano());

        // 获取指定的日期时间
        System.out.println(LocalDateTime.of(
                2021,
                6,
                12,
                12,
                32,
                33,
                123));

        // 获取当前日期时间
        System.out.println(LocalDateTime.now());

        // 获取日期时间信息
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now2.getYear());
        System.out.println(now2.getHour());
    }
}

package com.moriaty.jdk.datetime;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * <p>
 * DateTime 08
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest08 {
    public static void main(String[] args) {
        // 获取所有时区 id
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取标准时间
        ZonedDateTime bz = ZonedDateTime.now(Clock.systemUTC());
        System.out.println(bz);

        // 获取当前使用计算机默认的时区
        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);

        // 使用指定时区
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Pacific/Majuro"));
        System.out.println(now2);
    }
}

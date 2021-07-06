package com.moriaty.jdk.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 * <p>
 * DateTime 06
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest06 {
    public static void main(String[] args) throws InterruptedException {
        // 计算时间差
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(22, 48, 55);

        Duration duration = Duration.between(now, time);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        // 计算日期差
        LocalDate now1 = LocalDate.now();
        LocalDate date = LocalDate.of(2020, 1, 1);
        Period period = Period.between(date, now1);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
    }
}

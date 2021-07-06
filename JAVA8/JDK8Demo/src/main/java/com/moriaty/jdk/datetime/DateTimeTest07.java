package com.moriaty.jdk.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * <p>
 * DateTime 07
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest07 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // 将当前日期调整到下个月的一号
        TemporalAdjuster adjuster = (temporal) -> {
            LocalDate date = (LocalDate) temporal;
            return date.plusMonths(1).withDayOfMonth(1);
        };
        System.out.println(now.with(adjuster));

        // 使用封装好的
        System.out.println(now.with(TemporalAdjusters.firstDayOfNextMonth()));
    }
}

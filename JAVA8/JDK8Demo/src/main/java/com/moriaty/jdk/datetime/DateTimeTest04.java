package com.moriaty.jdk.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 * DateTime 04
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest04 {
    public static void main(String[] args) {

        // 格式化
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        System.out.println(now.format(df));

        // 字符串解析
        String s = "2020-10-11 22:11:12";
        System.out.println(LocalDateTime.parse(s, df));
    }
}

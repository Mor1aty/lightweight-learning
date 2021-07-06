package com.moriaty.jdk.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>
 * DateTime 05
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest05 {
    public static void main(String[] args) throws InterruptedException {
        Instant now = Instant.now();
        System.out.println(now);

        // 获取纳秒数据
        System.out.println(now.getNano());
        Thread.sleep(5);
        System.out.println((Instant.now().getNano() - now.getNano()));

    }
}

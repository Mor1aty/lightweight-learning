package com.moriaty.jdk.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * DateTime 01
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/6 11:26
 */
public class DateTimeTest01 {
    public static void main(String[] args) throws ParseException {
        /*
        旧版日期时间存在的问题
         */
        // 1、设计不合理
        Date date = new Date(2021,07, 06);
        System.out.println(date);

        // 2、时间格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
        System.out.println(sdf.parse("2021-05-06"));

        // 3、多线程的情况下会存在数据安全问题
        for (int i = 0; i < 50; i++) {
            new Thread(()-> {
                try {
                    System.out.println(sdf.parse("2021-05-06"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

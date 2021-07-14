package com.moriaty.newfunc;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * ToStringDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 12:28
 */
public class ToStringDemo {
    public static void main(String[] args) {
        var str = "张三";
        var bis = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_16));
        var bos = new ByteArrayOutputStream();

        var c = 0;
        while ((c = bis.read()) != -1) {
            bos.write(c);
        }

        System.out.println(bos.toString(StandardCharsets.UTF_16));
    }
}

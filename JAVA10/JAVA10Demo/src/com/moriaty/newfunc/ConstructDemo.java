package com.moriaty.newfunc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * ConstructDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 12:39
 */
public class ConstructDemo {
    public static void main(String[] args) throws IOException {
        var str = "张三";
        var p = new PrintWriter("e://aa.txt", StandardCharsets.UTF_8);
        p.println(str);
        p.flush();
        p.close();
    }
}

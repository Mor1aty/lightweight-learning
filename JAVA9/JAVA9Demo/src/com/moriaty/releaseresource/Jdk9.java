package com.moriaty.releaseresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>
 * JDK9 释放资源
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 17:58
 */
public class Jdk9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\v_yekgong\\Desktop\\1.txt");
        try (fileInputStream) {
            // 1. 建立程序与文件的数据通道

            // 2. 创建字节数组缓冲区
            byte[] buf = new byte[1024];
            int length = 0;

            // 3. 读取数据并且输出
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

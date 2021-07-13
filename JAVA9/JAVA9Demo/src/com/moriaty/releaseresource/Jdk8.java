package com.moriaty.releaseresource;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * <p>
 * JDK8 释放资源
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 17:58
 */
public class Jdk8 {
    public static void main(String[] args) {
        // 需要释放资源的代码，放入 try 中：try-with-resource
        // 初始化流对象的代码一定要写到 try 里
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\v_yekgong\\Desktop\\1.txt");) {
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

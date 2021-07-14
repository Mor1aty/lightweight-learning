package com.moriaty.newfunc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * TransferToDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 12:44
 */
public class TransferToDemo {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("e://aa.txt"), StandardCharsets.UTF_8));
        var p = new PrintWriter(new File("e://cc.txt"));
        reader.transferTo(p);
        p.flush();
        p.close();
        reader.close();
    }
}

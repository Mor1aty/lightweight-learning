package com.moriaty.newfunc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * <p>
 * ScannerDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 12:49
 */
public class ScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        var scan = new Scanner(new FileInputStream("e://aa.txt"), StandardCharsets.UTF_8);
        scan.useDelimiter("为");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
    }
}

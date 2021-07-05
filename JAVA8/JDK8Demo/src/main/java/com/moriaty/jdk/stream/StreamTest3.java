package com.moriaty.jdk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * <p>
 * Stream 3
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.stream();
        Set<String> set = new HashSet<>();
        set.stream();
        Vector<String> vector = new Vector<>();
        vector.stream();
    }
}

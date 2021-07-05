package com.moriaty.jdk.stream;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Stream 4
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.keySet().stream();
        map.values().stream();
        map.entrySet().stream();
    }
}

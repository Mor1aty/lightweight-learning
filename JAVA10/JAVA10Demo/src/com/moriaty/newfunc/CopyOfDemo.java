package com.moriaty.newfunc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * CopyOfDemo
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/14 12:22
 */
public class CopyOfDemo {

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        var list1 = List.copyOf(list);
        System.out.println(list1);

        var set = new HashSet<>();
        set.add("d");
        set.add("b");
        set.add("a");
        System.out.println(Set.copyOf(set));

        var map = new HashMap<String, String>();
        map.put("k1","v2");
        map.put("k2","v2");
        System.out.println(Map.copyOf(map));
    }
}

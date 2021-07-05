package com.moriaty.jdk.stream;



import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Stream 23 Res
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/1 17:57
 */
public class StreamTest23Res {

    public static void main(String[] args) {
        List<String> list = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toList());
        System.out.println(list);

        Set<String> set = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toSet());
        System.out.println(set);

        ArrayList<String> arrayList = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);

        HashSet<String> hashSet = Stream.of("aa", "bb", "cc", "aa")
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);

        System.out.println("-------------------------");
        Object[] objects = Stream.of("aa", "bb", "cc", "aa")
                .toArray();
        System.out.println(Arrays.toString(objects));

        String[] strings = Stream.of("aa", "bb", "cc", "aa")
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

    }
}

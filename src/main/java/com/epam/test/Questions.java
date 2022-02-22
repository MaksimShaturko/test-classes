package com.epam.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Questions {

    public static void main(String[] args) {
        List<String> list =
                Stream.of("a1", "fef", "a2", "a1", "3445", "a1").collect(Collectors.toList());

        list.stream().min((o1, o2) -> -1);
        list.stream().min(String::compareTo);

//        String[] str2 =
//                list.stream().map(String::toUpperCase).toArray(String[]::new);
//
//        String[] str3 =
//                list.stream().map(s -> s.toUpperCase()).toArray(String[]::new);
//        list.stream().forEach(System.out::println);
//        System.out.println(Arrays.toString(list.stream().flatMap(a -> Arrays.asList(a, a + a)
//                .stream())
//                .toArray(String[]::new)));
    }
}

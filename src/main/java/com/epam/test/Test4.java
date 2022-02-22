package com.epam.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {

    public static void main(String[] args) {


        List<String> list =
                Stream.of("a1", "fef", "a2", "a1", "3445", "a1").collect(Collectors.toList());
        System.out.println(list.stream().filter("a1"::equals).count());

        System.out.println(list.stream().sorted((String o1, String o2) -> {
            return -1;
        }).collect(Collectors.toList()));

        System.out.println(list);

        System.out.println(Arrays.toString(list.stream().flatMap(a -> Arrays.asList(a, a + a)
                                                        .stream())
                                                        .toArray(String[]::new)));

        String[] str = list.stream().flatMap(a -> Arrays.asList(a, a + a)
                     .stream().filter("a1"::equals))
                     .toArray(String[]::new);
        System.out.println(Arrays.toString(str));

        list.stream().min((o1, o2) -> -1);

        String[] str2 =
                list.stream().map(String::toUpperCase).toArray(String[]::new);

        String[] str3 =
                list.stream().map(s -> s.toUpperCase()).toArray(String[]::new);

        System.out.println(Arrays.toString(str2));
        System.out.println(Arrays.toString(str3));


    }
}

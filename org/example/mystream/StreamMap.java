package org.example.mystream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Java!");
        list.add("Ok!");
        list.add("Bay!");

        System.out.println(list.stream().flatMap(String::lines).collect(Collectors.toList()));

        List<Integer> list1 = list.stream().map(String::length)
                .collect(Collectors.toList());
        System.out.println(list1);

        int[] array = {6, 5, 3, 4};
        array = Arrays.stream(array).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello!");
        set.add("Java!");
        set.add("Ok!");
        set.add("Bay!");


        System.out.println(set);
        List<Integer> collect1 = set.stream().map(String::length).collect(Collectors.toList());
        System.out.println(collect1);


        Set<Integer> collect = set.stream().sorted().map(String::length).collect(Collectors.toSet());
        System.out.println(collect);


        List<Integer> list2 = List.of(12, 20, 22, 30, 32, 40, 10);
        System.out.println(list2.stream().filter(integer -> integer % 10 == 0).collect(Collectors.toList()));
        System.out.println(list2.stream().filter(integer -> integer % 2 != 0).count());
        System.out.println(list2.stream().sorted().collect(Collectors.toList()));
        System.out.println(list2.stream().sorted().limit(4).collect(Collectors.toList()));
        System.out.println(list2.stream().sorted().skip(4).collect(Collectors.toList()));
        System.out.println(list2.stream().peek(e -> System.out.println(e + 2)).collect(Collectors.toList()));
        list2.stream().map(x -> x * 2).toList().forEach(System.out::println);
        System.out.println(Arrays.toString(list2.stream()
                .flatMapToDouble(i -> DoubleStream
                        .of(i.doubleValue())).toArray()));

        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        List<Integer> list3 = lists.stream().flatMap(List::stream).toList();

    }
    }




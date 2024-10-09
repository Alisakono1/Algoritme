package org.example.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
       Worker worker1 = new Worker("Ivan",20,1100,"MacRuby");
       Worker worker2 = new Worker("Ivana",22,1500,"Manager");
       Worker worker3 = new Worker("Anna",25,1000,"MacRuby");
       Worker worker4 = new Worker("Tom",27,1400,"Manager");
       Worker worker5 = new Worker("Anton",23,1200,"SaleManager");
       Worker worker6 = new Worker("Inna",29,1300,"SaleManager");
       List<Worker> workers = List.of(worker1,worker2,worker3,worker4,worker5,worker6);

      // Группировка списка рабочих по их должности.(деление на списки)
        Map<String, List<Worker>> map1 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition));
        System.out.println(map1);
        //по должности( деление на множества).

        Map<String, Set<Worker>> map2 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,
                        Collectors.toSet()));
        System.out.println(map2);

        //Подсчен количества рабочих,занимаемых конкретную должность.

        Map<String,Long> map3 = workers.stream().collect(Collectors.groupingBy(Worker::getPosition,Collectors.counting()));
        System.out.println(map3);

       // Группировка списка рабочих по именам.
        Map<String,Set<String>> map4 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,Collectors.mapping(Worker::getName,Collectors.toSet())));
        System.out.println(map4);

        //Расчет средней зарплаты для данное должности.

        Map<String,Double> map5 = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,Collectors.averagingDouble(Worker::getSalary)));
        System.out.println(map5);

        //Группировка списка рабочих по должности и возрасту.

        Map<String, Map<Integer, List<Worker>>> collect = workers.stream()
                .collect(Collectors.groupingBy(Worker::getPosition,Collectors.groupingBy(Worker::getAge)));
        System.out.println(collect);

        String[][] strings = new String[3][];
        strings[0] = new String[]{"A", "B"};
        strings[1] = new String[]{"C", "D", "E", "F"};
        strings[2] = new String[]{"G", "H", "K"};;
        IntStream.range(0, strings.length)
               .peek(i -> System.out.println("Retrieving data from i = " + i))
                .boxed()
               .flatMap(i -> Arrays.stream(strings[i]))
                .forEach(System.out::println);

        IntStream.range(0, strings.length)
                .peek(i -> System.out.println("Retrieving data from i = " + i))
                .boxed()
                .flatMap(i -> Arrays.stream(strings[i]))
                .forEach(System.out::println);

        IntStream.range(0, 3).flatMap(i -> IntStream.range(0, 3)).forEach(System.out::println);
        IntStream.range(0, 3).flatMap(i -> IntStream.of(1, 1, 1)).forEach(System.out::println);
    }}

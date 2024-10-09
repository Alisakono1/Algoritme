package org.example.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A","B","C");
        System.out.println(Arrays.toString(stream.toArray()));
        Stream<Integer> stream1 = Stream.of(1,2,3,5);
        System.out.println(stream1.collect(Collectors.toSet()));
        int[] numbers = {3,5,1,7};
        IntStream stream2 = Arrays.stream(numbers);
        System.out.println(Arrays.toString(stream2.toArray()));
        List<String> list = Arrays.asList("a","b","c");
        Stream<String> stream3 = list.stream();
        System.out.println(stream3.collect(Collectors.toSet()));
        Stream<Double> randoms = Stream.generate(Math::random).limit(10);
        System.out.println(randoms.collect(Collectors.toSet()));
        Stream<Integer> evenNumbers = Stream.iterate(0,n-> n+2);

        //Промежуточные операции

        List<String> strings = Arrays.asList("a","b","c");
        Stream<String> distinctStrings = strings.stream().filter(s -> s.equals("a"));

        Stream<String> stream4 =Stream.of("a","b","c");
        Stream<String> upperCaseStream = stream4.map(String::toUpperCase);

        List<List<String>> listList = Arrays.asList(Arrays.asList("a"),Arrays.asList("b"));
        Stream<String> flatStream = listList.stream().flatMap(Collection::stream);

        Stream<String> stream5 = Stream.of("a","b","c");
        Stream<String> distinctStream = stream5.distinct();

        Stream<String> stream6 = Stream.of("a","b","c");
        Stream<String> sortedStream = stream6.sorted();

        Stream<String> stream7 = Stream.of("a","b","c");
        Stream<String> sortedStream1 = stream7.sorted(Comparator.reverseOrder());

        Stream<String> stream8 = Stream.of("a","b","c");
        Stream<String> peekStream = stream8.peek(System.out::println);

        Stream<String> stream9 = Stream.of("a","b","c");
        Stream<String> limitedStream = stream9.limit(2);

        Stream<String> stream10 = Stream.of("a","b","c");
        Stream<String> skippedStream = stream10.skip(1);

        

    }
}

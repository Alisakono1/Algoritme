package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        //  Напиши программу, которая находит сумму всех чисел от 1 до 100.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> sum = IntStream.range(1, 100).boxed().reduce(Integer::sum)
                .stream().toList();
        System.out.println(sum);

        // Создай программу, которая находит среднее арифметическое массива чисел.

        double[] arr = {5, 6, 7, 9, 2, 7, 1};
        OptionalDouble average = Arrays.stream(arr).average();
        long count = Arrays.stream(arr).count();
        System.out.println(count);
        System.out.println(average);

        // Напиши программу, которая определяет, является ли данное число простым, используя стримы.

      /*  int numberToCheck = 17; // Замени на число, которое ты хочешь проверить

        boolean isPrime = isPrime(numberToCheck);

        if (isPrime) {
            System.out.println(numberToCheck + " является простым числом.");
        } else {
            System.out.println(numberToCheck + " не является простым числом.");
        }


        public static boolean isPrime ( int number){
            return number > 1 && IntStream.range(2, (int) Math.sqrt(number) + 1)
                    .noneMatch(i -> number % i == 0);
        }*/

        //  Разработай программу для нахождения всех уникальных слов в предложении, используя стримы



         String string = "Develop a program to find all unique words in a sentence using streams";
        String[] words = string.split("\\W");

        System.out.println(Arrays.toString(Arrays.stream(words).distinct().toArray()));

       // Создай программу, которая умножает каждый элемент списка на заданное число, используя стримы.

        List<Integer> integers = List.of(5, 6, 7, 9, 2, 7, 1);
        System.out.println(integers.stream().map(el -> el * 2).toList());

       // Напиши программу, которая находит сумму квадратов всех чисел в списке, используя стримы.

        System.out.println(integers.stream().map(x -> x * x).toList());

       // Разработай программу для нахождения самого длинного слова в списке, используя стримы.



        // Создай программу, которая фильтрует список строк по заданной длине, используя стримы.

        List<String> stringList = List.of("hello","bay","string","loop","integer");
        System.out.println(stringList.stream().collect(Collectors.groupingBy(String::length)));

       // Напиши программу, которая находит среднюю длину слов в списке, используя стримы.

        Double collect = stringList.stream().collect(Collectors.averagingInt(String::length));
        System.out.println(collect);



    }
}





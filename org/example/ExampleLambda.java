package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class ExampleLambda {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = (x)->x>4;
        System.out.println(isPositive.test(3));

        BinaryOperator<Integer> multiply = (x,y)->x*y;
        System.out.println(multiply.apply(3,5));

        UnaryOperator<Integer> square = (x)->x*x;
        System.out.println(square.apply(5));

        Function<Integer,String> converter = String::valueOf;
        System.out.println(converter.apply(10)+1);

        Consumer<Integer> print = System.out::println;
        print.accept(3);

      /*  Supplier<String> stringFactory = ()->{
            System.out.println("Enter the text: ");
            return new Scanner(System.in).nextLine();
        };
        System.out.println(stringFactory.get());*/
        System.out.println();
        List<Integer> myList = new ArrayList<>();
        Supplier<Integer> supplier = ()->{
            Random random = new Random();
            return  random.nextInt(15);

        };
        myList.add(0,supplier.get());
        myList.add(1,supplier.get());
        myList.add(2,supplier.get());
        myList.add(3,supplier.get());
        myList.add(4,supplier.get());


        System.out.println(myList);

        Consumer<Integer> integerConsumer = (Integer num)-> {
            if ( num %2 ==0){
                System.out.println(num);

            }else {
                System.err.println(num);
            }

    };
       /* integerConsumer.accept(10);
        integerConsumer.accept(11);
        integerConsumer.accept(12);
        integerConsumer.accept(13);
        integerConsumer.accept(14);*/


        System.out.println();
        String c1 = "white";
        String c2 = "black";
        Predicate<String> isWhiteCat = (c)-> c.equals(c1);
        System.out.println(isWhiteCat.test(c2));


        BiFunction<Integer, Integer, Integer> powerFunction = (base, exponent) -> {
            // Проверка на нулевую степень
            if (exponent == 0) {
                return 1;
            }
            int result = 1;
            // Возведение в степень
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        };

        // Пример использования BiFunction
        int base = 2;
        int exponent = 3;
        int result = powerFunction.apply(base, exponent);
        System.out.println(base + " в степени " + exponent + " = " + result);

}}

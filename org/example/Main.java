package org.example;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
    //    IntStream.range(0, 3).flatMap(i -> IntStream.of(1, 1, 1)).forEach(System.out::println);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}






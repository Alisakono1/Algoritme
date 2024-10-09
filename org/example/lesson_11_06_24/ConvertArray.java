package org.example.lesson_11_06_24;

import java.util.Arrays;

public class ConvertArray {
    public static String convertArrayToRangesString(int[] array) {
        if (array == null || array.length == 0) {
            return "empty";
        }
        Arrays.sort(array);

        StringBuilder result = new StringBuilder();
        int start = array[0];
        int end = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == end + 1) {
                end = array[i];
            } else {
                extracted(start, end, result);
                start = array[i];
                end = array[i];
            }
        }
        extracted(start, end, result);

        return result.toString();
    }

    private static void extracted(int start, int end, StringBuilder result) {
        if (start == end) {
            result.append(start).append(",");
        } else {
            result.append(start).append("-").append(end).append(",");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 7, 2, 15, 14, 16, 9, 8};
        String result = convertArrayToRangesString(array);
        System.out.println(result);
    }
}

//* Задача 1
// Конвертировать массив целых чисел в строку диапазонов
//
// Примеры:
//
// Input: [1, 5, 3, 4, 7, 2]
// Output: "1-5,7"
//
// Input: [5, 3, 4, 7, 2, 15, 14, 16, 9, 8]
// Output: "2-5,7-9,14-16"
//
// Input: [5, 3, 4, 7, 2, 15, 14, 16, 9]
// Output: "2-5,7,9,14-16"
//
// для решения можно воспользоваться сортировкой массива: arr.sort()


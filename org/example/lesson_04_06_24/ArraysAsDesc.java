package org.example.lesson_04_06_24;

public class ArraysAsDesc {
    public static void main(String[] args) {
        int[] array = {1, 5, 12, 20};
        int[] array1 = {1, 5, 4, 20};
        int[] array2 = {1};
        int[] array3 = {};
        int[] array4 = {1,5,5,12,20};

        System.out.println(checkAscending(array));
        System.out.println(checkAscending(array1));
        System.out.println(checkAscending(array2));
        System.out.println(checkAscending(array3));
        System.out.println(checkSortMode(array1));
        System.out.println(checkSortMode(array2));
        System.out.println(checkSortMode(array3));
        System.out.println(checkSortMode(array4));

    }

    public static boolean checkAscending(int[] array) {
        boolean result = false;
        if (array.length<=1)return true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1] || array[i] <= array[i + 1]) {
                result = true;

            }else {
                return false;
            }

        }
        return result;
    }
    public static int checkSortMode(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
        if (array[i] <= array[i+1]) {
            result = 1;
        }
        for (int i1 = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                result = 0;

            } else {
                result = -1;
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        result = 0;
                    }
                }
            }

        }

    }
        return result;
    }}




package org.example;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void bubbleSortRecursive(int[] array, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubbleSortRecursive(array, n - 1);
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));

        bubbleSortRecursive(array, array.length);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(array));
    }
}

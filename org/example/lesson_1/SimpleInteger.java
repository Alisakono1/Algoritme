package org.example.lesson_1;

import java.util.Arrays;

public class SimpleInteger {
    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        int z = 25;
        if (x == y || x == z || y == z) {
            System.out.println(false);
        }else {
            System.out.println(true);}
        if ((x > y) && (x > z)) {
            System.out.println("max = x");
        } else if ((y > x) && (y > z)) {
            System.out.println("max = y");
        } else {
            System.out.println("max = z");
        }




        int[] array = {2, 6, 8, 1, 7, 3, 9, 2, 8};

        for (int i = array.length - 1; i >= 0; i--) { // O(n)

            System.out.print(array[i] + " ");

        }
        System.out.println();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {  // O(n)
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
            }

        }
        bubbleSort(array);
        System.out.println("Sorted array");
        for (int num : array) {
            System.out.println(num + " ");
        }
    }

    private static void bubbleSort(int[] array) {    // O(n^2)
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}






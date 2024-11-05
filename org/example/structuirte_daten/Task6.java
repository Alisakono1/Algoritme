package org.example.structuirte_daten;

import java.util.Arrays;

/**
 * Сортировка пузырьком.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {6, 8, 7, 1, 9, 5, 2, 0, -5, 21, 33};
        System.out.println(Arrays.toString(array));
        arraySort(array);


    }
    public static void arraySort(int[] arr){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}




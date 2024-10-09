package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Sorting {
    private static int[] array;

    public static void main(String[] args) {
        int[] arr = {-2, -4, 1, 8, 6, 7,0,100};
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int @NotNull [] array) {
        Sorting.array = array;

       for (int i = 1;i< array.length; i++){
           int current = array[i];
           int j = i-1;
           while (j>=0 && array[j]>current){
               array[j+1] = array[j];
               j--;

           }
           array[j+1]=current;
        }
    }
}



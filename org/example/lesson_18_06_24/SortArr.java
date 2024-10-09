package org.example.lesson_18_06_24;

import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] arr = {-2, -5, -7, 0, 2, 5, 7};
        System.out.println(Arrays.toString(Arrays.stream(arr).map(o -> o * o).sorted().distinct().toArray()));
        System.out.println(Arrays.toString(arr));
        sortAr(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
        }
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sortAr(int[] arr) {
        int j;
        for (j = 0; j < arr.length; j++) {
            arr[j] *= arr[j];
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}















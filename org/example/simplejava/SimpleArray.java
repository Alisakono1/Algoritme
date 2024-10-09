package org.example.simplejava;

import java.util.Arrays;


public class SimpleArray {
    private static final int MIN_PARALLEL_SORT_SIZE = 4;

    public static void main(String[] args) {
        int[] arr = {2, 5, -7, 8, 6, 2, 47, 85, -2, 45, 78, 2, 99};
        Arrays.sort(arr);//quick
        for (int i = 0; i < arr.length; i++) {


        }
        System.out.println(Arrays.toString(arr));

        String[] houses = {"house1","house2","house3"};
        System.out.println(Arrays.toString(houses));
        for (int i = 0; i < houses.length; i++) {
            System.out.print(houses[houses.length-i-1]+" ");

        }


    }
   /* static void sort(int[] a, int parallelism, int low, int high) {
        int size = high - low;

        if (parallelism > 1 && size > MIN_PARALLEL_SORT_SIZE) {
            int depth = getDepth(parallelism, size >> 12);
            int[] b = depth == 0 ? null : new int[size];
            Void invoke = new DualPivotQuicksort.Sorter(null, a, b, low, size, low, depth).invoke();
        } else {
            sort(null, a, 0, low, high);
        }
    }
*/


}




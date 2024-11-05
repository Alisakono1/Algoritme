package org.example.structuirte_daten;

/**
 * Найти второе минимальное число.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {3, 5, -1, 7, 6, 4, 2, 0,0,-1,-2};
        int min = array[0];
        int min2 = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min2 = min;
                min = j;
            } else if (j < min2 && j != min) {
                min2 = j;
            }
        }
        if (min2 != Integer.MAX_VALUE) {
            System.out.println(min2);
        } else {
            System.out.println("not min number");
        }
        System.out.println(min);
    }
}

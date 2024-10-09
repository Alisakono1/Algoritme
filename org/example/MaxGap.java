package org.example;

public class MaxGap {
    public static int maxGapIter(int[] input) {
        if (input == null || input.length < 2) {
            throw new IllegalArgumentException();
        }
        int maxDifference = Integer.MIN_VALUE;
        for (int i = 1; i < input.length; i++) {
            int difference = input[i] - input[i - 1];
            if (difference > maxDifference) {
                maxDifference = difference;

            }

        }
        return maxDifference;
    }

    public static int maxGapRecursive(int[] input) {
        if (input == null || input.length < 2) {
            throw new IllegalArgumentException();
        }
        return findMaxDifference(input, 1, input[1] - input[0]);
    }

    private static int findMaxDifference(int[] input, int index, int currentMaxDiff) {
        if (index == input.length - 1) {
            return currentMaxDiff;
        }
        int difference = input[index + 1] - input[index];
        currentMaxDiff = Math.max(currentMaxDiff, difference);
        return findMaxDifference(input, index + 1, currentMaxDiff);

    }

    public static void main(String[] args) {

        System.out.println(maxGapIter(new int[]{2, 6, 7, 11, 14}));

        System.out.println(maxGapRecursive(new int[]{2, 6, 7, 11, 14, 20}));

        System.out.println(maxGap(new int[]{2, 6, 7, 11, 14, 20}));

    }

    private static int maxGap(int[] ints) {
        int maxNum = 0;
        for (int anInt : ints) {
            if (anInt > maxNum) {
                maxNum = anInt;
            }

        }
        return maxNum;
    }
}
//написать функцию, которая получает на вход отсортированный массив целых чисел
// и возвращает максимальную разницу между соседними значениями.
//Input: [2, 6, 7, 11, 14]
// Output: 4 (11-7)
//
// Сначала сделать нерекурсивную версию maxGapIter, затем - рекурсивную maxGapRecursive
package org.example.lesson_04_06_24;

public class MaxAcsendingLength {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 7, 12};
        System.out.println(maxAcsendingLength(arr));
    }

    public static int maxAcsendingLength(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 1;
            }
        }

        return maxLength;
    }
}

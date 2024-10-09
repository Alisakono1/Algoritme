package org.example.lesson_04_06_24;

public class Task {

    public class ArraysAscDesc {

        // Задача 1
        // Определить, является ли массив возрастающим
        // Массив может содержать одинаковые элементы
        //
        // Примеры:
        //
        // Input: [1,5,12,20]
        // Output: true
        //
        // Input: [1,5,4,20]
        // Output: false
        //
        // Input: [7]
        // Output: true
        //
        // Input: []
        // Output: true

        public static boolean checkAscending(int[] array) {
            return true;
        }

        // Задача 2
        // Определить, является ли массив возрастающим, убывающим или неотсортированным (3 состояния):
        // 1 - возрастающий, -1 - убывающий, 0 - неотсортированный
        // Массив может содержать одинаковые элементы
        //
        // Примеры:
        //
        // Input: [1,5,5,12,20]
        // Output: 1
        //
        // Input: [1,5,4,20]
        // Output: 0
        //
        // Input: [100,50,7,7]
        // Output: -1
        //
        // Input: []
        // Output: 1

        public static int checkSortMode(int[] array) {
            int result = 0;
            if (array[0] <= array[1]) {
                result = 1;
            }
            for (int i = 0; i < array.length - 1; i++) {
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
            return result;
        }

            // Задача 3
            // Найти максимальныю длину возрастающей последовательности в неотсортированном массиве
            //
            // Примеры:
            //
            // Input: [1, 5, 3, 4, 7, 2]
            // Output: 3 (3, 4, 7)



       /* public static int maxAcsendingLength(int[] array) {
            return 0;
        }*/

        public static void main(String[] args) {
            int[] array = {1, 5, 12, 20};
            int[] array1 = {1, 5, 4, 20};
            int[] array2 = {1};
            int[] array3 = {};
            int[] array4 = {100,50,7,7};
            int[] array5 = {1,5,5,12,20};

            System.out.println(ArraysAscDesc.checkSortMode(array));
            System.out.println(ArraysAscDesc.checkSortMode(array1));
            System.out.println(ArraysAscDesc.checkSortMode(array2));
            System.out.println(ArraysAscDesc.checkSortMode(array3));
            System.out.println(ArraysAscDesc.checkSortMode(array4));
            // checkAscending([])


        //

            //  maxAcsendingLength([])
        }
    }}

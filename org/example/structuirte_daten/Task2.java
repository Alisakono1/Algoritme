package org.example.structuirte_daten;

import java.util.Random;
import java.util.Scanner;

/**
 * Дано целое число. Определить, является ли последняя цифра этого числа - цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int value = scanner.nextInt();*/
        Random random = new Random();
        int value = random.nextInt();
        System.out.println(value);
        int reminder = Math.abs(value % 10);
        boolean test = (reminder == 3);
        if (test) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

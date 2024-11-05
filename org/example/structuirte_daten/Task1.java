package org.example.structuirte_daten;

import java.util.Scanner;

/**
 * Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-12: ");
        int month = scanner.nextInt();
        if (1 > month || month > 12) {
            System.out.println("Month is invalid " + month);
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month <= 5) {
            System.out.println("Spring");
        } else if (month <= 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}


package org.example.structuirte_daten;

import java.util.Random;

public class SimpleArrayAndList {
    public static void main(String[] args) {
        int[] marks = {5, 2, 5, 3, 1, 4, 8, 7, 6, 2};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student N" + (i + 1) + ": note " + marks[i]);
        }
        int[] marks1 = {3, 4, 5};
        String[] names = {"Tim", "Tom", "Ken"};

        for (int j = 0; j < 3; j++) {
            System.out.println(names[j] + " has note:" + marks1[j]);
        }
        int k = 1;
        for (k++; k != 5; ) {
            System.out.println(k);
            k++;
        }
        int a = 0;
        int b = 1;
        do {
            System.out.println("Hello!");
            a++;
        } while (a < b);

        int r;
        do {
            r = new Random().nextInt(20);
            System.out.println(r);
        } while (r >= 10);

        System.out.println("------------");
        int n = 10;
        int i = 1;
        int j;
        for (j = n - 1; i < j; i++, j--)
            System.out.println(i * j);


        //В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
        // смертность - 8 человек. Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год.
        // Рассчитайте, какая численность населения будет через 10 лет, учитывая, что рождаемость не может быть меньше
        // 7 человек на 1000 человек, а смертность не может быть меньше 6 человек на 1000 человек.
        int population = getPopulation();
        System.out.println(population);
    }

    private static int getPopulation() {
        int population = 10_000_000;
        int born = 14;
        int death = 8;
        // int dif= born-death;
        for (int i1 = 1; i1 <= 10; i1++) {
            if (born > 7) born -= 1;
            if (death > 6) death -= 1;
            population += population * (born - death) / 1000;
        }
        return population;

    }

}







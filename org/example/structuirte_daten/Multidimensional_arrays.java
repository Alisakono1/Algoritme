package org.example.structuirte_daten;

import java.util.Arrays;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        for (int[] ints : matrice) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrice.length/2; i++) {
            int n = matrice.length - 1;
            for (int j = i; j < matrice.length - i - 1; j++) {
                // System.out.println(matrice[i][j]);
                int temp = matrice[i][j];
                matrice[i][j] = matrice[n - j][i];
                matrice[n - j][i] = matrice[n - i][n - j];
                matrice[n - i][n - j] = matrice[j][n - i];
                matrice[j][n - i] = temp;
            }
            System.out.print((Arrays.deepToString(matrice)));


        }


    }

}

package org.example.simplejava;

import java.util.Arrays;

public class Cyclik {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j+"\t");
            }

            System.out.println(" ");
        }
        int[] arrX = {2,5,7,8,6,2,47,85,2,45,78,2,99};
        int maxim = arrX[0];
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i]>maxim){
                maxim = arrX[i];
            }
        }
        System.out.println(maxim);
        int sum = 0;
        for (int i = 0; i < arrX.length; i++) {
            sum += arrX[i];
        }
        System.out.println(sum);
       /* int[] arrY = new int[arrX.length];
        for (int i = 0; i < arrX.length; i++) {
            arrY = arrX;

        }
        System.out.println(Arrays.toString(arrY));*/
    }

}

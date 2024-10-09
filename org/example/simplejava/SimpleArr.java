package org.example.simplejava;

import java.util.Arrays;

public class SimpleArr {
    public static void main(String[] args) {
        int b = 100;
        System.out.println(method1(b));
        int[] arr = {2, 5, 7, 8, 6, 2, 47, 85, 2, 45, 78, 2, 99};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
       /* int x = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);*/
        int a = 123456;
        System.out.println(reverseInt(a));

    }

    private static int method1(int b) {
        if (b==500){
            return b;
        }
        b = b+50;
        return method1(b);
    }

    private static int reverseInt(int numb) {
        int newNumb = 0;
        while (numb != 0){
            newNumb = numb%10+newNumb*10;
            numb = numb/10;

        }
        return newNumb;

    }


}

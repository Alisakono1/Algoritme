package org.example;

import java.util.Random;
import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
       int x = new Random().nextInt(50);
       int y;
       while (true){
           System.out.println("enter the number: ");
           y = new Scanner(System.in).nextInt();
           if (x==y){
               System.out.println("Gewonnen "+x);
               break;
           } else if (x<y) {
               System.out.println("number < "+y);

           }else {
               System.out.println(" number > "+y);
           }
       }
    }
}

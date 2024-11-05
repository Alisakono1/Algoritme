package org.example.structuirte_daten;

public class SimpleSwitch {
    public static void main(String[] args) {
        //byte,short,int,char, String,enum
        int month = 7;
       String result = switch (month){
            case 9,10,11-> "Autumn";
            case 6,7,8-> "Summer";
            case 1,2,12-> "Winter";
            case 3,4,5-> "Spring";
            default-> "Month is invalid";
        };
        System.out.println(result);
    }
}

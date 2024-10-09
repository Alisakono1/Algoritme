package org.example.simplejava;

public class SimpleString {
    public static void main(String[] args) {
        String s = "112456789";
        System.out.println(s);
        for (int i = s.length()-1; i >=0; i--) {
            System.out.print(s.charAt(i));

        }
    }
}

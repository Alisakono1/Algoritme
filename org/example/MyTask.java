package org.example;

import java.util.*;

public class MyTask {
    public static void main(String[] args) {
       int[][] array = new int[3][];
       array[0] = new int[]{1,2,3,4,5,6};
       array[1] = new int[]{1,2,3};
       array[2] = new int[]{1};
       for (int[] ints : array){
           for (int anInt :ints){
               System.out.println(anInt+"");
               System.out.println();

               int[][] arr1 = {{1,2},{3,4}};
               int[][] arr2 = {{1,2},{3,4}};
               System.out.println(arr1 == arr2);

              /* String[] st = {"A","B","C"};
               List<String> list = new ArrayList<>();
               Collections.addAll(list,st);*/
              /* System.out.println(list);*/
               List<Long> list1 = new ArrayList<>();
               list1.add(2L);
               list1.add(3L);
               list1.add(1,1l);
               System.out.println(list1.get(2));
               Set<Boolean> set1 = new TreeSet<>();
               Set<Boolean> set2 = new HashSet<>();
            //   set1.add(null);
               set2.add(null);
               System.out.println(set1);
               System.out.println(set2);



    System.out.println();

       }


    }
}}

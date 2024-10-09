package org.example.serchAndSortAlgoritme;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(100));
        System.out.println(fibNaive(5));

        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaive2(n, mem));
        System.out.println(fibNaive1(10));
    }

    static long fib(long n) {
        long a = 0;
        long b = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    //    Фибоначчи рекурсия,наивный,медленный,очевидный  O(n*log(n))
    private static long fibNaive(int n) {
        if (n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
//    Быстрый,линейный,эффективный   О(n)

    //    Мемоизация оптимизация метода поиска чисел Фибоначчи
    private static long fibNaive2(int n, long[] mem) {
      if (mem[n]!=-1)return mem[n];
      if (n<= 1)return n;
      long result = fibNaive2(n-1,mem)+fibNaive2(n-2,mem);
      mem[n] = result;
        return result;
    }
    private static long fibNaive1(int m){
        long[] arr = new long[m+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i<= m; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[m];
    }
}

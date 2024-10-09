package org.example.lesson_11_06_24;

import java.util.ArrayList;
import java.util.List;
// Задача 2
//
// Вывести все способы, которыми мужно набрать сумму из набора монет нужного достоинства
//
// Примеры:
// Input: [2,3,5], 7
// Output:
// 2,2,3
// 3,5
public class CoinCombinations {

    public static void findCombinations(int[] coins, int target) {
        List<Integer> currentCombination = new ArrayList<>();

        findCombinationsHelper(coins, target,  currentCombination);
    }

    private static void findCombinationsHelper(int[] coins, int sum, List<Integer> currentCombination) {
        if (sum == 0) {
            System.out.println(currentCombination);
            return;
        }

        for (int coin : coins) {
            if (coin <= sum) {
                currentCombination.add(coin);
                findCombinationsHelper(coins, sum - coin, currentCombination);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {2,3,5};
        int target = 7;
      //  System.out.println("Комбинации для достижения суммы " + target + ":");
        findCombinations(coins, target);
    }
}

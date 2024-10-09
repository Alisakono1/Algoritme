package org.example.lesson_25_06_24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> recoverIps(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result; // Быстрый возврат, если длина строки не подходит для IP-адреса
        }
        findIps(s, 0, "", 0, result);
        return result;
    }

    private static void findIps(String s, int index, String current, int count, List<String> result) {
        if (count > 4) {
            return; // Если частей больше 4, возврат
        }
        if (count == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // Добавляем текущий результат без последней точки
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (index + i > s.length()) {
                break;
            }
            String part = s.substring(index, index + i);
            if (isValid(part)) {
                findIps(s, index + i, current + part + ".", count + 1, result);
            }
        }
    }

    private static boolean isValid(String s) {
        return s.length() <= 3 && !s.isEmpty() && (s.length() == 1 || !s.startsWith("0")) && Integer.parseInt(s) <= 255;
    }

    public static void main(String[] args) {
        System.out.println(recoverIps("25525511135"));
        System.out.println(recoverIps("101023"));
    }
}

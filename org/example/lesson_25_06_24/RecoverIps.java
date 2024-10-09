package org.example.lesson_25_06_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecoverIps {

    // Задача 1
    // Восстановить все возможные IP адреса по строке цифр, если это возможно
    // IP адрес - это строка, содержащая 4 числа 0 <= N <= 255, разделённых точками
    //
    // Примеры:
    //
    // Input: "25525511135"
    // Output: ["255.255.11.135","255.255.111.35"]
    //
    // Input: "101023"
    // Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]


        public static List<String> recoverIps(String s) {
            return recursIp(s, 4);
        }

        public static List<String> recursIp(String tail, int part) {
            List<String> list = new ArrayList<>();
            if (part == 0 || tail.isEmpty()) {
                return list;
            }
           /* if (part == 1 && isCorrect(tail)) {
                list.add(tail);
            }else {
                for (int i = 1; i < 4; i++) {
                    if (tail.length() >= i) {
                        String s1 = tail.substring(0, i);
                        if (isCorrect(s1)) {
                            List<String> result = recursIp(tail.substring(i), part - 1);
                            for (String s : result) {

                                list.add(s1 + "." + s);
                            }

                        }
                    }
                }
            }
            return list;

            private static boolean isValid(String s) {
                return s.length() <= 3 && !s.isEmpty() && (s.length() == 1 || !s.startsWith("0")) && Integer.parseInt(s) <= 255;
            }*/
            return list;
        }

}

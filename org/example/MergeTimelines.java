package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeTimelines {
    // Даны два временных ряда со отметками времени и измеряемыми значениями:
    // MeasurePoint(int at, int value)
    //
    // получить временной ряд, объединяющий два ряда который суммирует значения
    //
    // Пример:
    // 1: 2:5, 3:7, 8:2, 10:4 - MeasurePoint(2, 5), MeasurePoint(3, 7), MeasurePoint(8, 2), MeasurePoint(10, 4),
    //
    // 2: 2:1, 3:2, 5:1, 9:4,
    //
    // R: 2:6, 3:9, 5:8, 8:3, 9:6, 10:8
    //
    //    5  7  7  7  7  7  2  2  4
    //    1  2  2  1  1  1  1  4  4
    //    6  9  9  8  8  8  3  6  8
    //  --2--3--4--5--6--7--8--9--10--
    //    *  *     *        *  *  *

    // 1: 2, 3, 8, 10
    // 2: 2, 3, 5, 9
    //    2, 3, 5, 8. 9, 10

    public static class MeasurePoint {
        int at;
        int value;

        public MeasurePoint(int at, int value) {
            this.at = at;
            this.value = value;
        }

        public int getAt() {
            return at;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "MeasurePoint{" +
                    "at=" + at +
                    ", value=" + value +
                    '}';
        }
    }

    public static class TimeSeriesMerger {

        public static List<MeasurePoint> mergeTimeSeries(List<MeasurePoint> series1, List<MeasurePoint> series2) {
            // Объединяем два списка
            List<MeasurePoint> combinedList = new ArrayList<>(series1);
            combinedList.addAll(series2);

            // Сортируем по отметкам времени
            combinedList.sort(Comparator.comparingInt(mp -> mp.at));

            // Создаем список для хранения результата
            List<MeasurePoint> result = new ArrayList<>();

            // Переменные для хранения текущей метки времени и суммы значений
            int currentAt = -1;
            int currentValueSum = 0;

            // Обрабатываем отсортированный список
            for (MeasurePoint point : combinedList) {
                if (point.at != currentAt) {
                    // Если это не первая итерация, добавляем накопленные значения в результат
                    if (currentAt != -1) {
                        result.add(new MeasurePoint(currentAt, currentValueSum));
                    }
                    // Обновляем текущую метку времени и сбрасываем сумму
                    currentAt = point.at;
                    currentValueSum = point.value;
                } else {
                    // Если метка времени та же, суммируем значения
                    currentValueSum += point.value;
                }
            }

            // Добавляем последний накопленный элемент
            result.add(new MeasurePoint(currentAt, currentValueSum));

            return result;
        }

        public static void main(String[] args) {
            List<MeasurePoint> series1 = Arrays.asList(
                    new MeasurePoint(1, 10),
                    new MeasurePoint(2, 20),
                    new MeasurePoint(3, 30)
            );

            List<MeasurePoint> series2 = Arrays.asList(
                    new MeasurePoint(2, 15),
                    new MeasurePoint(3, 25),
                    new MeasurePoint(4, 35)
            );

            List<MeasurePoint> mergedSeries = mergeTimeSeries(series1, series2);

            for (MeasurePoint point : mergedSeries) {
                System.out.println(point);
            }
        }
}}
//@dem4nd

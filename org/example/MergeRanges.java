package org.example;

import java.util.ArrayList;

public class MergeRanges { public static class Range {
    public int from;
    public int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }
}

    public static ArrayList<Range> mergeRangesIter(Range[] ranges) {
        return new ArrayList<Range>();
    }

    public static ArrayList<Range> mergeRangesRecursive(Range[] ranges) {
        return new ArrayList<Range>();
    }

    public static void main(String[] args) {
        System.out.println(mergeRangesIter(new Range[]{new Range(2, 6), new Range(7, 11), new Range(10, 13), new Range(17, 21)}));

        System.out.println(mergeRangesIter(new Range[]{new Range(2, 6), new Range(7, 11), new Range(10, 15), new Range(14, 21)}));
    }
}
 //   написать функцию, которая получает на вход отсортированный по полю from массив
// интервалов и возвращает массив интервалов без пересесечений - пересекающиеся
// интервалы объединяются. Например:
//
// Input: [Range(2, 6), Range(7, 11), Range(10, 13), Range(17, 21)]
// Output: [Range(2, 6), Range(7, 13), Range(17, 21)]
// Input:
// 01____6789012345678901 Range(2, 6)
// 0123456____12345678901 Range(7, 11)
// 0123456789___345678901 Range(10, 13)
// 01234567890123456____1 Range(17, 21)
// Output:
// 01____6______3456____1
// Input: [Range(2, 6), Range(7, 11), Range(10, 15), Range(14, 21)]
// Output: [Range(2, 6), Range(7, 21)]
// Сначала сделать нерекурсивную версию mergeRangesIter, затем - рекурсивную mergeRangesRecursive

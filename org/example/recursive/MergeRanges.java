package org.example.recursive;

import java.util.ArrayList;

public class MergeRanges {

    public static class Range {
        public int from;
        public int to;

        @Override
        public String toString() {
            return "Range" + "(" + from + ", " + to + ")";
        }

        public Range(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }

    public static ArrayList<Range> mergeRangesIter(Range[] ranges) {
        if (ranges == null || ranges.length == 0) {

            return new ArrayList<>();
        }
       // Arrays.sort(ranges, Comparator.comparingInt(a -> a.from));
        ArrayList<Range> merged = new ArrayList<>();
        Range current = ranges[0];
        for (Range range : ranges) {
            if (range.from <= current.to) {
                current.to = Math.max(current.to, range.to);
            } else {
                merged.add(current);
                current = range;
            }
        }
        merged.add(current);
        return merged;
    }

    public static ArrayList<Range> mergeRangesRecursive(Range[] ranges) {
        if (ranges == null || ranges.length == 0) {
            return new ArrayList<>();
        }
        // Arrays.sort(ranges, Comparator.comparingInt(a -> a.from));//сортировка по начальной точке
        return mergeRangesRecursiveHelper(ranges, 0, ranges.length);

    }

    private static ArrayList<Range> mergeRangesRecursiveHelper(Range[] ranges, int start, int end) {
        if (start >= end) {
            return new ArrayList<>();
        }
        if (start == end - 1) {
            ArrayList<Range> singleRange = new ArrayList<>();
            singleRange.add(ranges[start]);
            return singleRange;
        }
        ArrayList<Range> mergeRanges = mergeRangesRecursiveHelper(ranges, start + 1, end);
        Range current = ranges[start];

        if (!mergeRanges.isEmpty() && current.to >= mergeRanges.get(0).from) {
            mergeRanges.get(0).from = Math.min(current.from, mergeRanges.get(0).from);
            mergeRanges.get(0).to = Math.max(current.to, mergeRanges.get(0).to);
        } else {
            mergeRanges.add(0, current);
        }
        return mergeRanges;

    }

    public static void main(String[] args) {
        System.out.println(mergeRangesIter(new Range[]{new Range(2, 6), new Range(7, 11), new Range(10, 13), new Range(17, 21)}));


        System.out.println(mergeRangesRecursive(new Range[]{new Range(2, 6), new Range(5,8), new Range(7, 11), new Range(12, 15), new Range(14, 21)}));

    }

}
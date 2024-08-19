package com.leet_code;

import java.util.Arrays;

public class Non_overlapping_Intervals {
    public static void main(String[] args) {
int[][]a={{1,2},{1,4},{2,3},{3,4}};
        System.out.println(eraseOverlapIntervals(a));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {// you have not done yet//just copy pasted
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int end = intervals[0][1];
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] < end) {
                count++;
            }else{
                end=intervals[i][1];
            }
        }
        return count;
    }
}

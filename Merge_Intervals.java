package com.leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][]a={{1,3},{2,6},{8,10},{15,18}};

      merge2(a);
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(Arrays.toString(x[i]));
//        }
    }
    public static int[][] merge(int[][] intervals) {//only 63 test case

        List<int[]> x=new ArrayList<>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if ( e>=intervals[i][0]) {
                e=intervals[i][1];
            }else {
                int[]z={s,e};
                x.add(z);
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        int[]z={s,e};
        x.add(z);
        int[][] array = new int[x.size()][];
        for(int i = 0; i < x.size(); i++) array[i] = x.get(i);
        return array;
    }
    public static int[][] merge2(int[][] intervals) { //efficent all test cases

        if (intervals.length <= 1)
            return intervals;

        //Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] x : intervals) {
            if (newInterval[1] >= x[0])
                newInterval[1] = Math.max(newInterval[1], x[1]);
            else {
                newInterval = x;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

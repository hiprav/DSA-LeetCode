package com.leet_code;

import java.util.Arrays;
import java.util.HashSet;

public class Unique_Number_of_Occurrences {
    public static void main(String[] args) {
       int[]a={1,2,3,4,5};
        System.out.println(uniqueOccurrences(a));

    }
    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer>a=new HashSet<>();
        int sum=0;
        int num=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                sum++;
            }else if(a.contains(sum)){
                    return false;
            }else {
                a.add(sum);
                sum=1;
                num=arr[i];
            }
        }
        if(a.contains(sum)){
            return false;
        }
        return true;
    }
}

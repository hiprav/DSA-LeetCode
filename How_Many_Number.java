package com.leet_code;

import java.util.Arrays;
import java.util.HashMap;

public class How_Many_Number {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] samll_the_current(int[] nums){
        HashMap<Integer,Integer> capitalCities = new HashMap<Integer,Integer>(nums.length);
        int[] xxx=new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                     count+=1;
                }
            }
            xxx[i]=count;
        }
        return xxx;
    }


////////////////////////////////////////////////////////////////////////////////////////////
//   more optimise code from leetcode

   static int[] smallerNumbersThanCurrent(int[] nums) {
        // Create buckets for counting sort
        int [] buckets = new int [102];

        // Get Frequency of each element
        for(int num : nums) {
            buckets [num]++;
        }

        // Count smaller numbers than each element
        for (int i =1; i<buckets.length; i++) {
            buckets[i] += buckets[i-1];
        }

        // populate the result
        int[] result = new int[nums.length];
        for (int i=0; i< result.length; i++) {
            if(nums[i] == 0)
                result[i] = 0;
            else
                result[i] = buckets[nums[i]-1];
        }
        return result;

    }
}

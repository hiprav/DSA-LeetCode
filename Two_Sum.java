package com.leet_code;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                int[] arr={i,map.get(target-nums[i])};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}

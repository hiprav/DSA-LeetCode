package com.leet_code;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}

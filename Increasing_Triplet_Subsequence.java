package com.leet_code;

public class Increasing_Triplet_Subsequence {
    public static void main(String[] args) {
        int[] arr={20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length > 2) {
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= a) {
                    a=nums[i];
                } else if(nums[i]<=b){
                    b=nums[i];
                }else if(nums[i]>b){
                    return true;
                }
            }
        }
        return false;
    }
}

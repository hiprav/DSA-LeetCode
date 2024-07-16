package com.leet_code;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(arr));
    }
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max=0;
        int a=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            int q=0;
            while (q!=i+1){
                for (int j = q; j <= i; j++) {
                    max+=nums[j];
                }
                q++;
                if(a<=max){a=max;}max=0;
            }
        }
        return a;
    }
    public static int maxSubArray2(int[] nums) {
        int max = nums[0];
        int a = nums[0];
        for (int i = 1; i < nums.length; i++) {
            a = Math.max(nums[i], nums[i] + a);
            max = Math.max(a, max);
        }
        return max;
    }
}

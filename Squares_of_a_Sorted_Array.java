package com.leet_code;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));

    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        sort(nums,0,nums.length-1);
        return nums;
    }
    static void sort(int[]arr, int low ,int hi){
        if (low>=hi) {
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=arr[m];

        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
            }
            while (arr[e]>pivot) {
                e--;
            }
            if (s<=e) {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s , hi);
    }
}

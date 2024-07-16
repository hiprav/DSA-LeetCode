package com.leet_code;

import java.util.Arrays;

public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[]a={1,4,4};
        System.out.println(splitArray(a,3));
    }
    public static int res=0;
    public static int splitArray(int[] nums, int k) {//  you have not done this answer, you just copy past

        int max =0;
        int min=Integer.MIN_VALUE;
        for(int i : nums){
            max+=i;
            min = Math.max(min,i);
        }

        int mid = min+(max- min)/2;
        binarySearch(nums, k,min, mid, max);
        return res;

    }
    public static void binarySearch(int[] nums, int k , int start , int mid , int end){
        if(start>end) return ;
        mid = start+(end-start)/2;
        if(isFeasible(nums, k , mid)<=k){
            end = mid-1;
            res = mid;
            binarySearch(nums, k, start, mid, end);


        }else{
            start = mid+1;
            binarySearch(nums, k, start, mid, end);

        }

    }
    public static int isFeasible(int[] nums, int k , int n){
        int c=0, total=0;
        for(int i : nums){
            if(total+i<=n) total+=i;
            else{
                c++;
                total=i;
            }
        }
        return c+1;
    }
}

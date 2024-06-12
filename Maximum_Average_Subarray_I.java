package com.leet_code;

public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int[] arr={-1, -2, -3, -4, -5, -6};
        int k=2;
       System.out.println(findMaxAverage(arr,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double d=-11111;
        int s=0;
        int e=0;
        double sum=0;
        while (s<nums.length) {
            sum+=nums[s];
            if (s-e+1 == k) {
                d=Math.max(d,sum/k);
                sum-=nums[e];
                e++;
            }
            s++;
        }
        return d;

    }
    public static double findMaxAverage2(int[] nums, int k) {
            double res =-1111;
            int back=0;
            int front=0;
            double sum=0;
        while(front<=nums.length-1){
            sum+=nums[front];
            if(front-back+1==k){
                res=Math.max(res,(sum/k));
                sum-=nums[back++];
            }
            front++;
        }
        return res;
}}
//double res =-1111;
//int i=0;
//int j=0;
//double sum=0;
//        while(j<=nums.length-1){
//sum+=nums[j];
//        if(j-i+1==k){
//res=Math.max(res,(sum/k));
//sum-=nums[i++];
//        }
//j++;
//        }
//        return res;




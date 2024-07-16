package com.leet_code;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr={4,5,5,6,1,2,2,3};
        System.out.println(search(arr,1));
    }
    public static int search(int[] nums, int target) {
        if (nums[0]<nums[nums.length-1]){
            return binary(nums,0,nums.length-1,target);
        }
        int c=x(nums);
        int v=binary(nums,0,c,target);
        if (v!=-1){
            return v;
        }
        return binary(nums,c+1,nums.length-1,target);
    }
    public static int binary(int[] arr,int s,int e,int target){
        int start=s;
        int end=e;

        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid] > target ) {
                end=mid-1;
            } else if (arr[mid] < target) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int x(int[]nums){
        int s=0;
        int e=nums.length-1;
        while(s<e) {
            int mid=s+(e-s)/2;
            if(nums[s]<nums[mid]){
                s=mid;
            } else {
                e=mid;
            }
        }
        return e;
    }
}

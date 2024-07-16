package com.leet_code;

public class Peak_Index_in_a_Mountain_Array {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,5,4};
        System.out.println(peakIndexInMountainArray(ar));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]) {
                return mid;
            }
           else if (arr[mid-1]<arr[mid]){
                s=mid;
            }
            else if (arr[mid]>arr[mid+1]){
                e=mid;
            }
        }
        return -1;
    }
}

package com.leet_code;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[]nums1 = {1,2};
        int[]nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+ nums2.length];
        int e=0;
        for (int i = 0; i < nums1.length+ nums2.length; i++) {
            if (i<nums1.length){
                a[i]=nums1[i];
            }else {
                a[i]=nums2[e];
                e++;
            }
        }
        sort(a,0,a.length-1);
        int mid=a.length/2;
        System.out.println(mid);
        if (a.length%2==1){
            return a[mid];
        }
        else {
            double x=(a[mid-1]+a[mid])/2d;
            return x;
        }
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

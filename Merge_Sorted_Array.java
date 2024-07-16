package com.leet_code;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
    int[] a={1,2,3,0,0,0};
    int[]b= {2,5,6};
    merge(a,3,b,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j <m ; j++) {
                if (nums1[j] >= nums2[i]) {
                    int temp=nums1[j];
                    nums1[j]=nums2[i];
                    nums2[i]=temp;
                }
            }
            nums1[m]=nums2[i];
            m++;
        }
        System.out.println(Arrays.toString(nums1));
    }
}

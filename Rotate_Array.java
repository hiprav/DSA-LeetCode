package com.leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotate(arr,2);
    }
    public static void rotate(int[] nums, int k) {
        int[] a=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i+k)%nums.length] = nums[i];
        }
        nums=a;
    }
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i =0;i<nums.length;i++)
        {
            int s = (i+k)%n;
            ans[s] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}

package com.leet_code;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] u={1};
        System.out.println(Arrays.toString(searchRange(u,1)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] a= {-1,-1};
        boolean x=true;
        boolean y=true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && x) {
                a[0]=i;
                x=false;
            }
            if (nums[nums.length-i-1] == target && y) {
                a[1]=nums.length-i-1;
                y=false;
            }

        }
        return a;
    }
}

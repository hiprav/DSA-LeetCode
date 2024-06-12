package com.leet_code;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};//[1,3,12,0,0]
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
    public void moveZeroes2(int[] nums) {///       musta approch
        int j=0;
        for( int num :nums){
            if(num != 0){
                nums[j]=num;
                j++;
            }
        }
        for( int i=j;i<nums.length;i++){
            nums[i]=0;
        }

    }
}

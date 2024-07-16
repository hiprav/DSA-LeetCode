package com.leet_code;

public class Remove_Element {
    public static void main(String[] args) {
        int[]a={3,2,2,3};
        System.out.println(removeElement(a,3));
    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 1&&nums[0]==val) {
            return 0;
        }
        int snake=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                snake++;
            }else {
                int temp = nums[i - snake];
                nums[i - snake] = nums[i];
                nums[i] = temp;
            }
        }
        return nums.length-snake;
    }
}

package com.leet_code;

import java.util.Arrays;

public class X_Contains_Duplicate_III {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1};
        System.out.println(containsNearbyAlmostDuplicate(arr,3,0));
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int s=0;
        int e=indexDiff;
        for (int i = 0; i < nums.length-indexDiff; i++) {
            int[] temp=new int[indexDiff+1];
            for (int j = 0; j < indexDiff+1; j++) {
                temp[j]=nums[j+i];
            }
            Arrays.sort(temp);
            s=0;
            e= temp.length-1;
           while(s<e){
               if (Math.abs(temp[s]-temp[e]) <=valueDiff) {
                   return true;
               }if (temp[s]-temp[e] >valueDiff){
                   s++;
               }else e--;
           }
        }
        return false;
    }
//    public static boolean containsNearbyAlmostDuplicate1(int[] nums, int indexDiff, int valueDiff) {
//
//    }
}

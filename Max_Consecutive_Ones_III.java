package com.leet_code;

import java.util.PriorityQueue;
import java.util.Queue;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int[] arr={0,0,0,1};
        int k=4;
        System.out.println(longestOnes(arr,k));
    }
    public static int longestOnes(int[] nums, int k) {

        Queue<Integer> queue=new PriorityQueue<>();
        int st=0;
        int en=0;
        int total=0;
        int count=0;
        while (st<nums.length) {//  [1,1,1,0,0,0,1,1,1,1,0]  passed 40 test cases
            if (nums[st]==0) {
                total++;
                queue.add(st);
                count=Math.max(count,(st-en)-1);
                if (total > k) {
                    en=queue.remove()+1;
                    total--;
                }
            }
            st++;
        }
        if (count==0){
            return 0;
        }
        return count+1;

        //--------------------------------------------------------
//        int start=0;
//        int end=0;
//        int zeros=0;
//
//        while(end<nums.length){
//            if(nums[end] == 0){
//                zeros++;
//            }
//            end++;
//            if(zeros>k){
//                if(nums[start] == 0){
//                    zeros--;
//                }
//                start++;
//            }
//        }
//        return end-start;
    }
}

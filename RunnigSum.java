package leet_code;


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class RunnigSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runsum(nums)));
    }
    static int[] runsum(int[] nums){
        int sum=0;
        int[] runningSum=new int[nums.length];
            for(int i=0;i< nums.length;i++){
                runningSum[i] = sum+=nums[i];
            }
            return runningSum;
    }
}

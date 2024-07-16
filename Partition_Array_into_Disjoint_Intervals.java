package com.leet_code;

public class Partition_Array_into_Disjoint_Intervals {
    public int partitionDisjoint(int[] nums) {// didn't understand the fundamentals of this problem...
        int l=nums[0];
        int g=nums[0];
        int p=0;
        for(int i=1;i<nums.length;i++){
            g=Math.max(g,nums[i]);
            if(l>nums[i]){
                p=i;
                l=g;
            }
        }
        return p+1;
    }
}

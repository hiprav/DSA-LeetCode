package com.leet_code;

import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {
    public static void main(String[] args) {
        int[]s={3,1,2};
        int[]p={8,5,8};
        System.out.println(Arrays.toString(successfulPairs(s,p,16)));
    }
    public static int[] successfulPairs2(int[] spells, int[] potions, long success) {
        int[]ans=new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int count=0;
            for (int j = 0; j < potions.length; j++) {
                if (spells[i]*potions[j]>=success){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[]ans=new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int count=potions.length;
            int s=0;
            int e= potions.length-1;

           while (s<=e){

              int mid= s+(e-s)/2;
               if (potions[mid]*spells[i] >= success) {
                   count = mid;
                   e = mid - 1;
               }else {

                   s=mid+1;
               }
           }
                ans[i]=potions.length-count;
        }
        return ans;
    }
}

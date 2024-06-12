package com.leet_code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
        int[] aa={1,2,3,3};
int[]arr={1,1,2,2};
        System.out.println( findDifference(aa,arr));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> xxx=new ArrayList<>();
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        List<Integer> b1=new ArrayList<>();
        List<Integer> b2=new ArrayList<>();
        List< List<Integer> > ans=new ArrayList<>();
        a1.contains(1);
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < Math.max(nums1.length,nums2.length); i++) {
            if (i < nums1.length) {
                a1.add(nums1[i]);
            }a2.add(nums2[i]);
        }
        for (int i = 0; i < Math.max(nums1.length,nums2.length); i++) {
            if (!a1.contains(nums2[i])) {
                b1.add(nums2[i]);
            }if (!a2.contains(nums1[i])) {
                b2.add(nums1[i]);
            }
        }
            ans.add(b2);
        ans.add(b1);
        return ans;
    }
}

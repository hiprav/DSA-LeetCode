package com.leet_code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_the_Difference_of_Two_Arrays {
    public static void main(String[] args) {
        int[] aa={1,2,3};
        int[]arr={2,4,6};
        System.out.println(findDifference(aa,arr));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        for (int i : s1) {
            if (!s2.contains(i)) {
                ans.get(0).add(i);
            }
        }
        for (int i : s2) {
            if (!s1.contains(i)) {
                ans.get(1).add(i);
            }
        }
        return ans;
    }
}

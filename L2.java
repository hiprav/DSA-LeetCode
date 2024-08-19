package com.leet_code;


import java.util.*;

public class L2 {
    public static void main(String[] args) {
        List<int[]> c=findDistinctPairs(new int[]{1,22,3,43,4,5},new int[]{3,4,55,6,7,71});
        for (int i = 0; i < c.size(); i++) {
            System.out.println(Arrays.toString(c.get(i)));
        }
    }
    public static List<int[]> findDistinctPairs(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            set2.add(num);
        }

        List<int[]> pairs = new ArrayList<>();

        // Generate all unique pairs with one element from each array
        for (int num1 : set1) {
            for (int num2 : set2) {
                // Ensure the first element is always less than the second element
                if (num1 < num2) {
                    pairs.add(new int[]{num1, num2});
                } else if (num1 > num2) {
                    pairs.add(new int[]{num2, num1});
                }
            }
        }

        // Use a set to ensure there are no duplicate pairs
        Set<List<Integer>> uniquePairs = new HashSet<>();
        for (int[] pair : pairs) {
            uniquePairs.add(Arrays.asList(pair[0], pair[1]));
        }

        // Convert the set back to a list of pairs
        List<int[]> distinctPairs = new ArrayList<>();
        for (List<Integer> pair : uniquePairs) {
            distinctPairs.add(new int[]{pair.get(0), pair.get(1)});
        }
        return distinctPairs;
    }
}




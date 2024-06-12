package com.leet_code;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
    public static void main(String[] args) {

    }
    public static boolean containsDuplicate(int[] nums, int k) {
        Set<Integer> intset=new HashSet<>();
        for(int num:nums){
            if(intset.contains(num)){
                return true;
            }
            intset.add(num);
        }
        return false;
    }
}

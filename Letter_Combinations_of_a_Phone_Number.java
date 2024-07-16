package com.leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        System.out.println(-2==-'2'-'0');
    }
    public static List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if (digits.isEmpty()) {
            return ans;
        }
        HashMap<Integer,String> dile=new HashMap<>();
        dile.put(2,"abc");
        dile.put(3,"def");
        dile.put(4,"ghi");
        dile.put(5,"jkl");
        dile.put(6,"mno");
        dile.put(7,"pqrs");
        dile.put(8,"tuv");
        dile.put(9,"wxyz");
        String d=dile.get(digits.charAt(0));
        help("",dile,digits,ans);
        return ans;
    }

    private static void help(String combo, HashMap<Integer, String> dile, String digits, List<String> ans) {
        if (digits.isEmpty()) {
            ans.add(combo);
        }else {
            String x = dile.get(digits.charAt(0) - '0');
            for (char z : x.toCharArray()) {//make habit of using advance for loop
                help(combo + z, dile, digits.substring(1), ans);
            }
        }
    }
}

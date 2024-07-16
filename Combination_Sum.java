package com.leet_code;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[] a={2,3,5};
        int t=8;
        for (List<Integer> i : combinationSum(a,t)) {
            System.out.print(i);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        recursion(0,candidates,target,ds,res);
        return res;
    }
    private static void recursion(int start,int[] candidates,int target,List<Integer>list,List<List<Integer>>res){
        if (start== candidates.length){
        if (target == 0) {
            res.add(new ArrayList<>(list));
        }
        return;
        }if(candidates[start]<=target) {
            list.add(candidates[start]);
            recursion(start,candidates,target-candidates[start],list,res);
            list.removeLast();
        }
        recursion(start+1,candidates,target,list,res);
    }
}

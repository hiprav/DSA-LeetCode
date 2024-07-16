package com.leet_code;

import java.util.HashSet;

public class Two_Sum_IV {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean a=false;
    public HashSet<Integer> h=new HashSet<>();
    public boolean findsum(TreeNode root,int k){
        help(root,k);
        return a;
    }
    public void help(TreeNode node, int k){
        if (node == null) {
            return;
        }
        if (h.contains(node.val-k )) {
            a=true;
            return;
        }

        h.add(node.val);
        help(node.left,k);
        help(node.right,k);
    }
}
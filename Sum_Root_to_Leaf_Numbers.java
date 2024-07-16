package com.leet_code;

public class Sum_Root_to_Leaf_Numbers {
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
    }public int sum=0;
    public int sumNumbers(TreeNode root) {
        help(root,0);
        return sum;
    }
    public void help(TreeNode node,int t) {
        t=t*10+node.val;
        if (node.left == null && node.right == null) {
            sum += t;
            return;
        } else {
            help(node.left, t);
            help(node.right, t);
            return;
        }
    }
}

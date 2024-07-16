package com.leet_code;

public class Binary_Tree_Maximum_Path_Sum {
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
    int count=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
        return count;
    }
    public int help(TreeNode node){
        if (node == null) {
            return 0;
        }
        int l=help(node.left);
        int r=help(node.right);
        l=Math.max(0,l);
        r=Math.max(0,r);
        int sum=l+r+node.val;
        count=Math.max(count,sum);
        return Math.max(l,r)+ node.val;
    }
}

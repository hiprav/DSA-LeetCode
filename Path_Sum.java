package com.leet_code;

public class Path_Sum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,targetSum,0);
    }
    private boolean helper(TreeNode root, int targetSum, int i) {
        if (root == null) {
            return false;
        }
        i+= root.val;
        if (i == targetSum && root.left==null && root.right==null) {
            return true;
        }
        boolean l=helper(root.left,targetSum,i);
        boolean r=helper(root.right,targetSum,i);
        return l||r?true:false;
    }
}

package com.leet_code;

public class Diameter_of_Binary_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int count=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return count-1;
    }
    int height(TreeNode node){
        if (node == null) {
            return 0;
        }
        int left=height(node.left);// not able to identify how type Treenode is converted to int 
        int right=height(node.right);

        int di=left+right+1;
        count=Math.max(count,di);

        return Math.max(left,right)+1;
    }
}

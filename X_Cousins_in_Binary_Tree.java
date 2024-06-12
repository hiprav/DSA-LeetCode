package com.leet_code;

public class X_Cousins_in_Binary_Tree {
    public static void main(String[] args) {

    }
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
    public boolean isCousins(TreeNode root, int x, int y) {
        return(level(root,x,0)==level(root,y,0) && iscousins(root,x,y));
    }
    public int level(TreeNode node,int x,int count){
        if (node == null) {
            return count;
        }
        if (x == node.val) {
            return count;
        }
       int l=level(node.left,x,count++);
        if (l != 0) {
            return count;
        }
        return level(node.right,x,count++);
    }
    private boolean iscousins(TreeNode node, int x, int y) {
        if (node == null) {
            return false;
        }
        return  (node.left.val == x && node.right.val == y || node.left.val == y && node.right.val == x) || isCousins(node.left, x, y) || isCousins(node.right, x, y) ;
    }
    TreeNode find(TreeNode node, int x){
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode n=find(node.left,x);
        if (n != null) {
            return n;
        }
        return find(node.right, x);
    }
}

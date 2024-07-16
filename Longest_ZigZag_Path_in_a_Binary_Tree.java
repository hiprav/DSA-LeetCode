package com.leet_code;

public class Longest_ZigZag_Path_in_a_Binary_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int max=0;
    public int longestZigZag(TreeNode root) {
        help(root,0,true);
        return max;
    }
    public void help(TreeNode node,int a,boolean b){
        if(node==null){
            return;
        }
        max=Math.max(max,a);
        if(b==true){
            help(node.left,a+=1,false);
            help(node.right,1,true);
        }else{
            help(node.right,a+=1,true);
            help(node.left,1,false);
        }
    }
}

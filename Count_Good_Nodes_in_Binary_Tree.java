package com.leet_code;

public class Count_Good_Nodes_in_Binary_Tree {
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
    }public int count=0;
    public int goodNodes(TreeNode root) {
        help(root,Integer.MIN_VALUE);
    return count;
    }
    public void help(TreeNode node,int sum){
        if (node == null) {
            return ;
        }
        if (sum<=node.val){
            sum=node.val;
            count++;
        }
        help(node.left,sum);
        help(node.right,sum);
        return;
    }
}
//public int goodNodes(TreeNode root) {  optimised
//    if(root==null) return 0;
//    return dfs(root,root.val);
//}
//private int dfs(TreeNode root, int max){
//    if(root == null) return 0;
//
//    max = Math.max(max,root.val);
//    if(root.val >= max)
//        return 1 + dfs(root.left,max) + dfs(root.right,max);
//    else
//        return dfs(root.left,max) + dfs(root.right,max);
//}
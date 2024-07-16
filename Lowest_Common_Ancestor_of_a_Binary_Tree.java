package com.leet_code;

public class Lowest_Common_Ancestor_of_a_Binary_Tree {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {// pending to under stand
        if(root==null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);

        if(l != null && r != null){
            return root;
        }
        return l == null? r:l;
    }
}

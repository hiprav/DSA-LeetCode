package com.leet_code;

import jdk.dynalink.NamedOperation;

public class Validate_Binary_Search_Tree {
    public static void main(String[] args) {
        System.out.println(true && false);
    }
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

        public boolean isValidBST(TreeNode root) { // debug it ,u dnot understand yet, but very simple
     return  help(root,null,null);
        }
        public boolean help(TreeNode node,Integer low,Integer high){
            if (node == null) {
                return true;
            }
            if (low!=null && node.val<=low){
                return false;
            }
            if (high != null && node.val>=high) {
                return false;
            }
            boolean l=help(node.left,low, node.val);
            boolean r=help(node.right, node.val, high);

            return l&&r;
        }
}

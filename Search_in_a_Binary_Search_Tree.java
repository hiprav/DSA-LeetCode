package com.leet_code;

public class Search_in_a_Binary_Search_Tree {
    public class TreeNode {
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
    public TreeNode x;
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val== root.val){
            x=root;
            return x;
        }
        if (val< root.val){
          searchBST(root.left,val);
        }else {
            searchBST(root.right,val);
        }
        return x;
    }
    public TreeNode searchBST2(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        if (root.val == target) {
            return root;
        }
        if (target < root.val) {
            return searchBST(root.left, target);
        } else {
            return searchBST(root.right, target);
        }
    }
}

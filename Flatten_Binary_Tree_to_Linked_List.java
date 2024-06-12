package com.leet_code;

public class Flatten_Binary_Tree_to_Linked_List {
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
    public void flatten(TreeNode root) {// try to debug and understand
        TreeNode current=root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp=current.left;
                while (temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
        }
    }
}

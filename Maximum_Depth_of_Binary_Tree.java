package com.leet_code;

public class Maximum_Depth_of_Binary_Tree {
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
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left=maxDepth(root.left);
            int right=maxDepth(root.right);
            int dep=Math.max(left,right)+1;
            return dep;
        }
}

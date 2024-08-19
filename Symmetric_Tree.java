package com.leet_code;

public class Symmetric_Tree {
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
    public boolean isSymmetric(TreeNode root) {
    return isSameTree(root.left,root.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if(p == null && q == null){return true;}
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.right)&&isSameTree(p.right,q.left);
    }
}

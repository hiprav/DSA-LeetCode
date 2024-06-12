package com.leet_code;

public class Invert_Binary_Tree {
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

    public TreeNode invertTree(TreeNode root) {
        height(root);
        return root;
    }
    void height(TreeNode node){
        if (node == null) {
            return ;
        }
        height(node.left);// not able to identify how type Treenode is converted to int
        height(node.right);

        TreeNode temp=node.left;
        node.left=node.right;
        node.right=temp;
        return;
    }
}

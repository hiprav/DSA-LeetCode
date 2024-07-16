package com.leet_code;

public class Delete_Node_in_a_BST {
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
    public TreeNode deleteNode(TreeNode root, int key) {//didnt understand at all............
        if ( root == null)  return null ;
        else if (root.val < key)
            root.right = deleteNode(root.right , key );
        else if (root.val > key)
            root.left = deleteNode(root.left , key);
        else {
            if (root.right == null && root.left == null){
                return null;
            }
            else if (root.left !=null && root.right == null){
                return root.left ;

            }
            else if (root.left ==null && root.right != null){
                return root.right;
            }
            else {
                TreeNode curr = root  ;
                curr = curr.right ;
                while (curr!=null && curr.left!=null){
                    curr = curr.left ;
                }
                root.val = curr.val;
                root.right = deleteNode(root.right, root.val);
                return root ;

            }
        }
        return root ;
    }
}

package com.leet_code;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Level_Sum_of_a_Binary_Tree {
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

    public int maxLevelSum(TreeNode root) {
        if (root.left==null&&root.right == null) {
            return 1;
        }
        help(root);
        return 1;
    }
    public int help(TreeNode node){
        int level=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(node);
        int count=0;
        int resultmax=Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            count++;
            int size= queue.size();
            int max=0;
            for (int i = 0; i < size; i++) {
                TreeNode cr=queue.poll();
                max+=cr.val;
                if (cr.left != null) {
                queue.add(cr.left);
                }
                if (cr.right != null) {
                queue.add(cr.right);
                }
            }
            if (resultmax < max) {
                level=count;
                resultmax=max;
            }
        }
        return level;
    }
}

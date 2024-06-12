package com.leet_code;

import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public static void main(String[] args) {
        Binary_Tree_Zigzag_Level_Order_Traversal solution = new Binary_Tree_Zigzag_Level_Order_Traversal();

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(solution.zigzagLevelOrder(root));
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
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List <List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        boolean swift=false;
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Integer> arr=new ArrayList<>(size);
            for (int i=0;i<size;i++) {

                if (!swift) {
                    TreeNode node=queue.pollFirst();
                    arr.add(node.val);
                    if (node.left != null) {
                        queue.addLast(node.left);
                    }
                    if (node.right != null) {
                        queue.addLast(node.right);
                    }
                } else {
                    TreeNode node=queue.pollLast();
                    arr.add(node.val);
                    if (node.right != null) {
                        queue.addFirst(node.right);
                    }
                    if (node.left != null) {
                        queue.addFirst(node.left);
                    }
                }
            }
            swift=!swift;
            result.add(arr);
        }
        return result;
    }
}

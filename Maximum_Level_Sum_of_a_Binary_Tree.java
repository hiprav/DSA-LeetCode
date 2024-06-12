//package com.leet_code;
//
//import java.util.*;
//
//public class Maximum_Level_Sum_of_a_Binary_Tree {
//    public static void main(String[] args) {
//
//    }
//    public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode() {}
//      TreeNode(int val) { this.val = val; }
//      TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//          this.left = left;
//          this.right = right;
//      }
//  }
//    public int maxLevelSum(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if (root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new PriorityQueue<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//            for (int i=0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if (currentNode.left != null) {
//                    queue.offer(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    queue.offer(currentNode.right);
//                }
//            }
//            result.add(currentLevel);
//        }
//        return result;
//
//    }
//}

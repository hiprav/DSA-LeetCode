package com.leet_code;

import java.util.ArrayList;
import java.util.List;
public class Path_Sum_II {
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
    public List<List<Integer>> arr = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, targetSum, currentPath);
        return arr;
    }

    public void findPaths(TreeNode root, int target, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == target) {
            arr.add(new ArrayList<>(list));
        } else {
            findPaths(root.left, target - root.val, list);
            findPaths(root.right, target - root.val, list);
        }
        list.remove(list.size() - 1);
    }
}

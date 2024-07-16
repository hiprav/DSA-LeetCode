package com.leet_code;

import java.util.*;

public class Leaf_Similar_Trees {
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
    public List<Integer> getLeaveValues(TreeNode root, List<Integer> sequence) {
        if (root == null) {
            return sequence;
        }
        if (root.left == null && root.right == null) {
            sequence.add(root.val);
        } else {
            getLeaveValues(root.left, sequence);
            getLeaveValues(root.right, sequence);
        }
        return sequence;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();

        getLeaveValues(root1, seq1);
        getLeaveValues(root2, seq2);

        return seq1.equals(seq2);
    }
}

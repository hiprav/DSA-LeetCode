package com.leet_code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {
        public static void main(String[] args) {
            Average_of_Levels_in_Binary_Tree solution = new Average_of_Levels_in_Binary_Tree();
            TreeNode root = new TreeNode(3);

            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);

            System.out.println(averageOfLevels(root));
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
//    public static List<Double> averageOfLevels(TreeNode root) {//debug to understand   nice question   // my chuitya sloution
//           List<Double> result = new ArrayList<>();
//        List<List<Integer>> ans= levelOrder(root);
//        for (int i = 0; i < ans.size(); i++) {
//            double avg=avg(ans.get(i));
//            result.add(avg);
//        }
//           return result;
//        }
//        public static double avg(List<Integer> levels) {
//            double sum =0.0;
//            for (int i = 0; i < levels.size(); i++) {
//                sum+=levels.get(i);
//            }
//            return sum/levels.size();
//        }
//        public static List<List<Integer>> levelOrder(TreeNode root) {
//            List <List<Integer>> result=new ArrayList<>();
//            if (root == null) {
//                return result;
//            }
//            Queue<TreeNode> queue=new LinkedList<>();
//            queue.add(root);
//            while (!queue.isEmpty()) {
//                int size=queue.size();
//                List<Integer> arr=new ArrayList<>(size);
//                for (int i=0;i<size;i++) {
//                    TreeNode node=queue.poll();
//                    arr.add(node.val);
//                    if (node.left != null) {
//                        queue.add(node.left);
//                    }
//                    if (node.right != null) {
//                        queue.add(node.right);
//                    }
//                }
//                result.add(arr);
//            }
//            return result;
//        }
public static List<Double> averageOfLevels(TreeNode root) {
    List<Double> result=new ArrayList<>();
    if (root == null) {
        return result;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        int size=queue.size();
       double arr=0.0;
    //   int count=0;
        for (int i=0;i<size;i++) {
            TreeNode node=queue.poll();
            arr+=node.val;
         //   count++;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        result.add(arr/size);
    }
    return result;
}
}

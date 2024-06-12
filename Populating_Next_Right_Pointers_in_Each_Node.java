package com.leet_code;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(connect(root));
    }
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}

        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public static Node connect(Node root) {// this is your chutiya giri
        List <List<Integer>> result=new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size=queue.size();
            List<Node> arr=new ArrayList<>(size);
            for (int i=0;i<size;i++) {
                Node node=queue.poll();
                arr.add(node);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            for (int i=0;i<arr.size()-1;i++) {
                arr.get(i).next=arr.get(i+1);
            }
        }
        return root;
    }
    public static Node connect2(Node root) {// triky to understand please debug it...
        if (root == null) {
            return root;
        }
        Node leftmost=root;
        while (leftmost.left!=null){
            Node current=leftmost;
            while (current!=null){
                current.left.next=current.right;
                if (current.next != null) {
                    current.right.next=current.next.left;
                }
                current = current.next;
            }
            leftmost=leftmost.left;
        }
        return root;
    }
}

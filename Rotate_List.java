package com.leet_code;

import com.LinkedList.LL;

public class Rotate_List {
    Node head;
    public static class Node {
        private int val;
        private Node next;
        public Node(){}
        public Node(int value){
            this.val=value;
        }
        public Node(int value, Node next){
            this.val=value;
            this.next= next;}

  }
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head = node ;
    }
    public void display(){
        Node temp=head;
        while (temp!= null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }


    public Node rotateRight(Node head, int k) {
        if (k==0 ||  head== null||head.next==null) {
            return head;
        }
    Node last =head;
    int length=1;
    while (last.next!=null){
        last=last.next;
        length++;
    }
    last.next=head;
    int rotation=k;
    int skip=length-rotation;
    Node newlast = head;
        for (int i = 0; i < skip-1; i++) {
            newlast = newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        return head;
    }

}

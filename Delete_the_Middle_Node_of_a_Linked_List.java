package com.leet_code;

import com.LinkedList.LL;

public class Delete_the_Middle_Node_of_a_Linked_List {
      public static class Node {
      int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }
    public Node deleteMiddle(Node head) {
        Node s=head;
        Node f=head;
        while (f.next!=null && f.next.next!=null){
            f=f.next.next;
            if (f.next != null) {
                s=s.next;
            }
        }
        if (s.next==null){
            s.next=null;
        }else {s.next=s.next.next;}
        return s;
    }
    public Node deleteMiddle2(Node head) {
        if(head == null || head.next == null){
            return null;
        }

        Node fast = head.next.next;
        Node slow = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }

}

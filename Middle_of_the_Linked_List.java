package com.leet_code;

public class Middle_of_the_Linked_List {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    static public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static public ListNode middleNode2(ListNode head) {
        ListNode midp=null;
        while (head!= null&&head.next!=null){
            midp=(midp==null)?head:midp.next;
            head=head.next.next;
        }
        ListNode mid=midp.next;
        midp.next=null;
        return mid;
    }
}

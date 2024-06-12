package com.leet_code;

public class Middle_of_the_Linked_List {
    public static void main(String[] args) {

    }
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
        while (fast != null || fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}

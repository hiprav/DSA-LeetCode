package com.leet_code;

public class Reverse_Linked_List {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode root=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return root;
    }
    public ListNode reverseList2(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode x=null;
        ListNode p=head;
        ListNode c=head.next;
        while(c!=null){
            p.next=x;
            x=p;
            p=c;
            c=c.next;
        }
        p.next=x;
        return p;
    }
}

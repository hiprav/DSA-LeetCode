package com.leet_code;

public class Odd_Even_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode a=head;
        ListNode b=head.next;
        ListNode x=b;
        while( b!=null && b.next!=null && a.next!=null){
            a.next=b.next;
            a=a.next;
            b.next=a.next;
            b=b.next;
        }
        a.next=x;
        return head;
    }
}

package com.leet_code;

public class Remove_Nth_Node_From_End_of_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        if(head.next==null && n==1){
            head=null;
            return head;
        }
        ListNode s=head;
        ListNode f=head;
        while(n>0){
            f=f.next;
            n--;
        }
        if(f==null){//this edge is importent;
            head=head.next;
            return head;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return head;
    }
}

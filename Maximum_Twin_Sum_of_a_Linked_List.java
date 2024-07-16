package com.leet_code;

public class Maximum_Twin_Sum_of_a_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val+ head.next.val;
        }
        ListNode s=head;
        ListNode f=head;
        f=f.next.next;
        while(f!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode h=s.next;
        ListNode c=h.next;
        ListNode p=null;
        while(c!=null){
            h.next=p;
            p=h;
            h=c;
            c=c.next;
        }h.next=p;
        int max=0;
        while(h!=null){
            max=Math.max(max,head.val+h.val);
            head=head.next;
            h=h.next;
        }
        return max;
    }
}

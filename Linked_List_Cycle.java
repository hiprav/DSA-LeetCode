package com.leet_code;

public class Linked_List_Cycle {
    public static class ListNode {
                int val;
        ListNode next;
ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }

    }
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }
}

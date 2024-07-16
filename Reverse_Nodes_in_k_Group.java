package com.leet_code;

import java.util.ArrayList;
import java.util.List;

public class Reverse_Nodes_in_k_Group {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//    public ListNode reverseKGroup(ListNode head, int k) {
//
//    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }
    public ListNode isk(ListNode s,int k){
        while(k>1 && s.next!=null){
            s=s.next;
            k--;
        }
        if (k == 1) {
            return s;
        }
        return null;
    }
}

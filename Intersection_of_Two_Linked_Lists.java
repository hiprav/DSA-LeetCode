package com.leet_code;

public class Intersection_of_Two_Linked_Lists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }
        int u = count(headA);
        int d = count(headB);
        if (u > d) {
            while (u > d) {
                headA = headA.next;
                u--;
            }
        } else {
            while (d > u) {
                headB = headB.next;
                d--;
            }
        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int count(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}

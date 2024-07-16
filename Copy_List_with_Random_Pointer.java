package com.leet_code;

public class Copy_List_with_Random_Pointer {
    public class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; this.random = null;}
    }
    public ListNode copyRandomList(ListNode head) {// very nice and trickey question to to do, you have just seen this and not solved yet...
        if (head == null) return null;

        ListNode curr = head;
        while (curr != null) {
            ListNode newNode = new ListNode(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = head;
        ListNode newHead = head.next;
        ListNode newCurr = newHead;
        while (curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;
            if (curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }
}

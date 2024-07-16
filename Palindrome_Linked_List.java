package com.leet_code;

import java.util.Stack;

public class Palindrome_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        if ( head.next==null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> st=new Stack<>();
        while (fast != null && fast.next != null) {
            st.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast!=null){
        slow=slow.next;
        }
        while (slow!=null){
            if (slow.val == st.peek()) {
                st.pop();
            }slow=slow.next;
        }
        if (st.empty()){
            return true;
        }
        return false;
    }
}

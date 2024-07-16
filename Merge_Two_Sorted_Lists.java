package com.leet_code;

public class Merge_Two_Sorted_Lists {
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
    public ListNode mergeTwoLists(ListNode list1,ListNode list2){
        ListNode arr=new ListNode();
        ListNode x=arr;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                x.next = list1;
                list1 = list1.next;
                x = x.next;
            } else {
                x.next = list2;
                list2 = list2.next;
                x = x.next;
            }
        }
        x.next=(list1 != null) ? list1 : list2;
        return arr.next;
    }
}

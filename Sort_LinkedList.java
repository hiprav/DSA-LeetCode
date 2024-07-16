package com.leet_code;
public class Sort_LinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
//     public ListNode middleNode(ListNode head) {
//         ListNode midPrev = null;
//         while (head != null && head.next != null) {
//             midPrev = (midPrev == null) ? head : midPrev.next;
//             head = head.next.next;
//         }
//         ListNode mid = midPrev.next;
//         midPrev.next = null;
//         return mid;
//    }
public ListNode sortList(ListNode head) {/////right haaaaaaai🥇🥇🥇
    if (head==null || head.next==null){
        return head;
    }
    ListNode mid=middleNode2(head);
    ListNode left=sortList(head);
    ListNode right=sortList(mid);
    ListNode merge=mergeTwoLists(left,right);
    return merge;
}
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
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
     public ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode a =slow.next;
        slow.next=null;
        return a;
    }
}

package com.leet_code;

public class Add_Two_Numbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {// 95% working
        int l=getnumber(l1);
        int r=getnumber(l2);
        int sum=l+r;
        return getList(sum);
    }
    public int getnumber(ListNode node){
        if (node.next==null){
            return node.val;
        }
        int a=getnumber(node.next);
        a=(10*a)+node.val;
        return a;
    }
    public ListNode getList(int x){
        if (x == 0) {
            return null;
        }
        int f=x%10;
        x=x/10;
        ListNode a=new ListNode(f);
        a.next=getList(x);
        return a;
    }
}
//public ListNode addTwoNumbers(ListNode l1, ListNode l2) {   100% working
//    ListNode dummy = new ListNode(0);
//    ListNode current = dummy;
//    int carry = 0;
//
//    while (l1 != null || l2 != null || carry != 0) {
//        int x = (l1 != null) ? l1.val : 0;
//        int y = (l2 != null) ? l2.val : 0;
//        int sum = x + y + carry;
//        carry = sum / 10;
//        current.next = new ListNode(sum % 10);
//        current = current.next;
//        if (l1 != null) l1 = l1.next;
//        if (l2 != null) l2 = l2.next;
//    }
//
//    return dummy.next;
//}
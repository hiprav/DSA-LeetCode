//package com.leet_code;
//
//import java.util.HashMap;
//
//public class Linked_List_Cycle_II {
//    public static void main(String[] args) {
//        ListNode a=new ListNode();
//        a.insertfirst(1);
//        a.insertfirst(2);
//        a.insertfirst(3);
//        a.insertfirst(4);
//
//    }
//
//    public static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {
//        }
//
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//
//    }
//
//    public static ListNode detectCycle(ListNode head) {
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null && fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if(fast==slow){
//                while(head!=slow){
//                    head=head.next;
//                    slow=slow.next;
//                }return slow;
//            }
//        }
//        return null;
//    }
//}

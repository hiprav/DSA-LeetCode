package com.leet_code;

import com.LinkedList.LL;

public class Swap_Nodes_in_Pairs {
      public class ListNode {
          int val;
          ListNode next;
          private ListNode  head;
          private ListNode  tail;
          private int size;
          ListNode() {
          }
          ListNode(int val) {
              this.val = val;
          }
          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
          public void insertfirst(int val){
              ListNode node=new ListNode(val);
              node.next=head;
              head = node ;
              if(tail==null){
                  tail=head;
              }
              size+=1;
          }
      }
    public ListNode swapPairs1(ListNode head) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode point = dum;
        while(point.next != null && point.next.next != null) {

            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;
            swap1.next=swap2.next;
            swap2.next=swap1;
            point.next=swap2;
            point = swap1;
        }
        return dum.next;
    }
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        head.next = swapPairs2(temp.next);
        temp.next = head;
        return temp;
    }

    public static void main(String[] args) {

      }

}

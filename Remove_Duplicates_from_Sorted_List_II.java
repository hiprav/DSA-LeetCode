package com.leet_code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Remove_Duplicates_from_Sorted_List_II {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while (temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode cur=head;
        ListNode h=new ListNode();

        ListNode x=h;
        while(cur!=null){
            if (map.get(cur.val)==1){
                x.next=cur;
                cur=cur.next;
                x=x.next;
                x.next=null;
            }else cur=cur.next;
        }
        return h.next;
    }
    public ListNode deleteDuplicates1(ListNode head) {

        if (head == null || head.next== null) return head;

        ListNode dummyHead = new ListNode(0,head);
        ListNode prev = dummyHead;

        ListNode current = head;

        while (current!=null){

            if(current.next!=null && current.val==current.next.val){
                while(current.next!=null && current.val == current.next.val){
                    current = current.next;
                }
                prev.next= current.next;
            }
            else{
                prev=prev.next;
            }
            current = current.next;
        }
        return dummyHead.next;

    }
}

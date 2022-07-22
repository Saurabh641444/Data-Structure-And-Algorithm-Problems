/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode l=new ListNode(-1);
        ListNode lhead=l;
        ListNode r=new ListNode(-1);
        ListNode rhead=r;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                lhead.next=temp;
               
             lhead=lhead.next;
            }else{
                 rhead.next=temp;
               
             rhead=rhead.next;
            }
            temp=temp.next;
        }
        rhead.next=null;
        lhead.next=r.next;
  return l.next;
        
    }
}
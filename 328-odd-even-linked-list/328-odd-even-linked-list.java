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
    public ListNode oddEvenList(ListNode head) {
          if(head==null) return null;
        
        ListNode odd=head;
        ListNode even=head.next;
        
        ListNode head1=even;
        ListNode head2=odd;
        
        
        while(even!=null && even.next!=null){
          odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        
        
        
     
        odd.next=head1;
        return head2;
        
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       
         ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        
        while(fast!=null && fast.next!=null){
             slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=temp){
                    slow=slow.next;
                    temp=temp.next;
                }
                return slow;
            }
        }
        
        return null;
    }
}
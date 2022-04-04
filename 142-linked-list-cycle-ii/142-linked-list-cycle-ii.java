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
   /* public ListNode detectCycle(ListNode head) {
       
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
    }*/
    
     public ListNode detectCycle(ListNode head) {
       
       HashSet<ListNode> set=new HashSet<>();
         while(head!=null){
             if(set.contains(head)){
                 return head;
             }
             set.add(head);
             head=head.next;
         }
         return null;
    }
}
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head,slow=head,pre=null;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            ListNode next=slow;
            slow=slow.next;
            next.next=pre;
            pre=next;
        }
        
        if(fast!=null){ slow=slow.next;}
        
        
        while(pre!=null && slow!=null){
            if(pre.val!=slow.val){ return false;}
            slow=slow.next;
            pre=pre.next;
        }
        return pre==null || slow==null;
        
    }
}
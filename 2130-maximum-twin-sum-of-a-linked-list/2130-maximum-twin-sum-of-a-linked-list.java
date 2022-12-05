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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        ArrayList<Integer> arr=new ArrayList<>();
        
        while(fast!=null ){
            arr.add(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        
        int ans=Integer.MIN_VALUE;
        
        int i=arr.size()-1;
        
        while(slow!=null){
           ans=Math.max(ans,slow.val+arr.get(i--));
            slow=slow.next;
          }
        return ans;
        
    }
}
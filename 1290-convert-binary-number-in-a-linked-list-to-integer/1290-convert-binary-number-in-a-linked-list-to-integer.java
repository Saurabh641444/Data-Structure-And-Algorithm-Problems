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
    public int getDecimalValue(ListNode head) {
        ListNode t=head;
        int n=0;
        while(t!=null){
            n++;
            t=t.next;
        }
        int ans=0;
        while(n>0&&head!=null){
            ans+=head.val*Math.pow(2,n-1);
            n--;
            head=head.next;
        }
        
        return ans;
        
    }
}
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
    public static ListNode pnode;
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null){
            return;
        }
        
        ListNode mid=head,last=head.next;
        int count=1;
        
        while(last.next!=null&&last.next.next!=null){
            mid=mid.next;
            last=last.next.next;
            count++;
        }
        
        if(last.next!=null){
            mid=mid.next;
        }
        last=mid;
        pnode=mid.next;
        last.next=null;
        
        solve(head,count);
        
    }
    
    public static void solve(ListNode head,int count){
        if(count<=0) return;
        
        if(count!=0){
            solve(head.next,count-1);
        }
        
        ListNode temp=pnode;
        pnode=pnode.next;
        temp.next=head.next;
        head.next=temp;
        
        
    }
}
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
    public ListNode middleNode(ListNode head) {
        
        int n=0;
        ListNode t=head;
        while(t!=null){
            n++;
            t=t.next;
        }
        ListNode temp=head;
       
        if(n%2!=0){
            
            int mid=(n/2)+1;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        }else{
       
            int mid=n/2;
        for(int i=0;i<mid;i++){
            temp=temp.next;
        }}
        return temp;
        
    }
}
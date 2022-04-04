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
    /*public ListNode swapNodes(ListNode head, int k) {
       
        ArrayList<ListNode> list=new ArrayList<>();
        ListNode head1=head;
        int n=0;
        while(head1!=null){
            list.add(head1);
            head1=head1.next;
        }
        
        int len=list.size();
        int temp=list.get(k-1).val;
        list.get(k-1).val=list.get(len-k).val;
        list.get(len-k).val=temp;
        
        return head;//TC O(N) SC O(N)
        
       
      
    }*/
    
    public ListNode swapNodes(ListNode head, int k) {
       
     ListNode left=head;
     ListNode right=head;
     
        int count=0;
        
        while(left!=null){
            count++;
            if(count==k){
                break;
            }
            left=left.next;
        }
        
        ListNode head1=left;
        
        while(head1.next!=null){
            right=right.next;
            head1=head1.next;
        
        }
        
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        
        return head;
       
      
    }
    
    
}
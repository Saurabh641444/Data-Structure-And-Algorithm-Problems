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
    public ListNode swapNodes(ListNode head, int k) {
       
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
        
        return head;
        
       
      
    }
}
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
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if(head==null) return head;
//         ListNode current=head;
//         while(current!=null){
//                ListNode iter=current;
//                ListNode minNode=iter;
//                while(iter!=null){
//                      if(iter.val<minNode.val){
//                          minNode=iter;
//                           }
//                      iter=iter.next;
//                  }
//                  int temp=current.val;
//                  current.val=minNode.val;
//                  minNode.val=temp;
//                  current=current.next;//o(n*n)
//            }
//            return head;
//     }
// }

class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
           return merge(left,right);
    }
    private ListNode middleNode(ListNode head){
         ListNode slow=head, fast=head.next;
         while(fast!=null&& fast.next!=null){
                 slow=slow.next;
                 fast=fast.next.next;
             }
         ListNode mid=slow.next;
         slow.next=null;
         return mid;
     }
     private ListNode merge(ListNode l1,ListNode l2){
            ListNode temp=new ListNode(-1),current=temp;
            while(l1!=null && l2!=null){
                   if(l1.val<=l2.val){
                          current.next=l1;
                          l1=l1.next;
                    }else{
                           current.next=l2;
                           l2=l2.next;
                         }
                    current=current.next;
              }
             current.next=l1!=null?l1:l2;
            return temp.next;
             }
}
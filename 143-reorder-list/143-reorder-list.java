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
//     public static ListNode pnode;
//     public void reorderList(ListNode head) {
        
//         if(head==null || head.next==null){
//             return;
//         }
        
//         ListNode mid=head,last=head.next;
//         int count=1;
        
//         while(last.next!=null&&last.next.next!=null){
//             mid=mid.next;
//             last=last.next.next;
//             count++;
//         }
        
//         if(last.next!=null){
//             mid=mid.next;
//         }
//         last=mid;
//         pnode=mid.next;
//         last.next=null;
        
//         solve(head,count);
        
//     }
    
//     public static void solve(ListNode head,int count){
//         if(count<=0) return;
        
//         if(count!=0){
//             solve(head.next,count-1);
//         }
        
//         ListNode temp=pnode;
//         pnode=pnode.next;
//         temp.next=head.next;
//         head.next=temp;
        
        
//     }
// }

class Solution {
    public static ListNode pnode;
    public void reorderList(ListNode head) {
        
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        
        
        while(fast!=null&&fast.next!=null){
            prev=slow; 
            slow=slow.next;
             fast=fast.next.next;
            
        }
        
        prev.next=null;
        ListNode l1=head;
        ListNode l2=reverse(slow);
        merge(l1,l2);
        
    }
    
    public static void merge(ListNode l1,ListNode l2){
      while(l2!=null){
          ListNode next=l1.next;
          l1.next=l2;
          l1=l2;
          l2=next;
        }
        
        
    }

   public static ListNode reverse(ListNode l2){
       if(l2==null) return null;
       ListNode prev=null;
       ListNode curr=l2;
       ListNode next=l2.next;
       while(curr!=null){
       next=curr.next;
       curr.next=prev;
       prev=curr;
       curr=next;
         }
       return prev;
      }
}
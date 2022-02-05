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
    
    public ListNode mergeKLists(ListNode[] lists) {
       List<Integer> arr=new ArrayList<>(); 
       ListNode sol=new ListNode(0,null);
       ListNode temp=sol;
       for(int i=0;i<lists.length;i++){
          while(lists[i]!=null){
               arr.add(lists[i].val);
               lists[i]=lists[i].next;
             }
          }
      Collections.sort(arr);

      for(int x:arr){
        temp.next=new ListNode(x,null);
        temp=temp.next;
          }
      return sol.next;
    }
}
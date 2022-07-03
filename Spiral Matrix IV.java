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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[]=new int[m*n];
        int i=0;
        while(head!=null){
            arr[i++]=head.val;
            head=head.next;
        }
        
        for(int j=i;j<m*n;j++){
            arr[j]=-1;
        }
        
        return solve(arr,m,n);
    }
    
     private int[][] solve(int arr[],int m,int n){
      int [][] mat=new int[m][n];

     int top=0;
     int bottom=m-1;
     int left=0;
     int right=n-1;
        
      int index=0;

      while(true){
           if(left>right){ 
               break;
                 }
           for(int i=left;i<=right;i++){  
               mat[top][i]=arr[index++];
                } 
          top++;
            if(top>bottom){ 
                break;
            }
            for(int i= top;i<=bottom;i++){ 
                mat[i][right]=arr[index++];
            }
            
        right--;
        
       if(left>right){ 
           break;
       }
       for(int i=right;i>=left;i--){mat[bottom][i]=arr[index++];}
       bottom--;
      if(top>bottom){
          break;
      }
       for(int i=bottom;i>=top;i--){mat[i][left]=arr[index++];}left++;
     }
      return mat;
     }

   
    
}

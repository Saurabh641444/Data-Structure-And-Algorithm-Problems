class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
//       int temp=0;
      int len=num.length-1;
     final LinkedList<Integer> ans=new LinkedList<>();
      
      while(len>=0 || k!=0){
            if(len>=0){
                   k+=num[len];
                   len--;
                   }
                ans.addFirst(k%10);
                k/=10;
            }
    
         return ans;
        
//         final LinkedList<Integer> result = new LinkedList<>();
//     int len = num.length - 1;
    
//     while(len >= 0 || k != 0){
        
//         if(len >= 0){
//             k += num[len];
// 			len--;
//         }
        
//         result.addFirst(k % 10);
//         k /= 10;
//     }
        
//     return result;
    }
}
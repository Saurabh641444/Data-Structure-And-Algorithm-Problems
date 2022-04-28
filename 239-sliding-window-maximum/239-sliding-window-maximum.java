/*class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ri=0;
        int [] r= new int[n-k+1];
        
        // store index
        
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            // remove index out of range k
            if(!q.isEmpty() && q.peek()==(i-k)){q.poll();}
            
            //remove smaller numbers in the k range as they are useless
            
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){ q.pollLast();}
            q.offer(i);
            
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
            
        }
        
        return r;
        
    }
}*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
      
        int [] res= new int[n-k+1];
        
        Stack<Integer> st=new Stack<>();
        int nge[]=new int[n];
        nge[n-1]=n;
       st.push(n-1);
        for(int i=n-2;i>=0;i--){
          
         while(!st.isEmpty()&& nums[st.peek()]<=nums[i]){ st.pop();}
           
          if(st.isEmpty()){ nge[i]=n;}
          else{ nge[i]=st.peek();}  
          
           st.push(i);      
           }
          int j=0;
          int z=0;
         for(int i=0;i<=n-k;i++){
               if(j<i){j=i;}
              while(nge[j]<i+k){ j=nge[j];}
               res[i]=nums[j];
            }
        return res;
        
    }
}


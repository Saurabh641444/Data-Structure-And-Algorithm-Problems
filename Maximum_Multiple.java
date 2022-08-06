class Solution {
    public static long maximumMultiple(int N, int[] A) {
        // code here
        long ans=Long.MIN_VALUE;
        
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        
        
        Arrays.sort(A);
        
        boolean flag=false;
        int count1=0;
          int count2=0;
        for(int i=0;i<(A.length)/2;i++){
            l1.add(A[i]);
            if(A[i]<0)count1++;
            else{ count2++;}
        }
        
      
        for(int i=(A.length)/2;i<A.length;i++){
            l2.add(A[i]);
            if(A[i]>=0) count2++;
            else{ count1++;}
        }
        
        if(count1*2==N ){
            
              int i=0;
        int j=0;
        while(i<l1.size() && l2.size()>j){
             
             long prod=(long)l1.get(i) *(long)l2.get(j);
             ans=Math.max(ans,prod);
             i++;
             j++;
        }
        
        }else{
            
            int i=l1.size()-1;
        int j=0;
        
        while(i>=0 && l2.size()>j){
             
             long prod=(long)l1.get(i) *(long)l2.get(j);
             ans=Math.max(ans,prod);
             i--;
             j++;
              }
          
        }
        
            
        
        
        return ans;
        
    }
}

class Solution {
    public int maxChunksToSorted(int[] arr) {
        /*
                Entire approach is based on concept  sorted(A[:i+1])+sorted(A[i+1:])=sorted(A[n])
        
        but we can split A into A[:i+1] , A[i+1:] if and only if max(A[:i+1])<=min(A[i+1:])
        */
        
        int n=arr.length;
        
        int [] maxOfLeft=new int[n];
        int [] minOfRight=new int[n];
        
        maxOfLeft[0]=arr[0];
        
        for(int i=1;i<n;i++){
            maxOfLeft[i]=Math.max(maxOfLeft[i-1],arr[i]);
        }
        
        minOfRight[n-1]=arr[n-1];
        
        for(int i=n-2;i>=0;i--){
          minOfRight[i]=Math.min(minOfRight[i+1],arr[i]);    
        }
        
        int res=0;
        
        for(int i=0;i<n-1;i++){
            if(maxOfLeft[i]<=minOfRight[i+1]) res++;
        }
        return res+1;
    }
}
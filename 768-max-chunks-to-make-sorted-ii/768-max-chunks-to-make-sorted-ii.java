class Solution {
    public int maxChunksToSorted(int[] arr) {
        /*
        Entire approach is based on concept  sorted(A[:i+1])+sorted(A[i+1:])=sorted(A[n])
        
        but we can split A into A[:i+1] , A[i+1:] if and only if max(A[:i+1])<=min(A[i+1:])
        
        
        */
        int maxOfLeft[]=new int[arr.length];
        int minOfRight[]=new int[arr.length];
        
        maxOfLeft[0]=arr[0];
        
        for(int i=1;i<arr.length;i++){
            maxOfLeft[i]=Math.max(maxOfLeft[i-1],arr[i]);
        }
        
        minOfRight[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            minOfRight[i]=Math.min(minOfRight[i+1],arr[i]);
        }
        
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            if(maxOfLeft[i]<=minOfRight[i+1]) res++;
        }
        
        return res+1;
    }
}
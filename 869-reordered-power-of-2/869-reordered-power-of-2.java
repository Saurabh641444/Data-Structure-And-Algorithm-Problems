class Solution {
    public boolean reorderedPowerOf2(int n) {
      int[] A=count(n);
        
        for(int i=0;i<31;i++){
            if(Arrays.equals(A,count(1<<i))) return true;
        }
        
        return false;
    }
    
    public int[] count(int N){
        int[] ans=new int[10];
        while(N>0){
            ans[N%10]++;
            N=N/10;
        }
        
        return ans;
    }
}
class Solution {
    Integer dp[][];
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
           dp=new Integer[n][d+1];
        
        if(n<d) return -1;
        
        return solve(jobDifficulty,d,0,n);
    }
    
    private int solve(int[] jobDifficulty,int d,int index, int n){
        
        if(index==n && d==0) return 0;
        
        if(d<0) return (int)1e5;
        if(n<=index) return (int)1e5;
        if(dp[index][d]!=null) return dp[index][d];
        
        int max=0;
        int res=Integer.MAX_VALUE;
        
        for(int i=index;i<n;i++){
             max=Math.max(max,jobDifficulty[i]);
            res=Math.min(res,max+solve(jobDifficulty,d-1,i+1,n));
        }
                         
        return dp[index][d]=res;
    }
}
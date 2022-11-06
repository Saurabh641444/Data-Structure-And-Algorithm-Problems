class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()+1][triangle.size()+1];
        int n=triangle.size();
        
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
             
            int first=dp[i+1][j];
            int second=dp[i+1][j+1];
           dp[i][j]=triangle.get(i).get(j)+Math.min(first,second);
              
            }
        }
        
        return dp[0][0];
        // for(int [] a:dp){
        //     Arrays.fill(a,-1);
        // }
        // return dfs(triangle,0,0,Integer.MAX_VALUE,dp);
    }
    
    private int dfs(List<List<Integer>> triangle,int j,int start,int min,int dp[][]){
        
       
        if(j>=triangle.size()){
            return 0;
        }
        
        if(j-1==triangle.size()) return triangle.get(j).get(start);
        
        if( dp[j][start]!=-1) return dp[j][start];
        
         
        
       
            int first=dfs(triangle,j+1,start,min,dp);
            int second=dfs(triangle,j+1,start+1,min,dp);
            min=triangle.get(j).get(start)+Math.min(first,second);
       
       
        
        return dp[j][start]=min;
    }
}
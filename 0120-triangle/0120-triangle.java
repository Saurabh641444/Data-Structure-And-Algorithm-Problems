class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      
                
        int n=triangle.size();
        int front[]=new int[n];
        int curr[]=new int[n];
        
        for(int i=0;i<n;i++){
            front[i]=triangle.get(n-1).get(i);
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
             
            int first=triangle.get(i).get(j)+front[j];
            int second=triangle.get(i).get(j)+front[j+1];
            curr[j]=Math.min(first,second);
              
            }
            front=curr.clone();
            /*
            Note for JAVA folks, if you're trying O(N) space solution and not getting the right answer that is because of this line in front = cur; because in Java, simple assignment of one array to another makes a shallow copy of the assigned array viz. both the arrays get affected if there is any change happened in any one of the array. So the simple solution in java is:

front = cur.clone(); // creates deep copy of the array in Java*/
        }
        
        return front[0];
        
        /* int dp[][]=new int[triangle.size()+1][triangle.size()+1];
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
        
        return dp[0][0];*/
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
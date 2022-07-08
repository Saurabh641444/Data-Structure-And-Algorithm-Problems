class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        Integer[][][] dp=new Integer[m][n+1][target+1];
        int ans=helper(0,houses,cost,target,0,0,dp);
        return ans==Integer.MAX_VALUE ? -1:ans;
    }

    public int helper(int i,int[] houses,int[][] cost,int target,int prevColor,int neigh,Integer[][][] dp){
    if(i==houses.length || neigh>target){
           if(neigh==target) return 0;
         return Integer.MAX_VALUE;
         }

     if(dp[i][prevColor][neigh]!=null){ return dp[i][prevColor][neigh];}
     int minCost=Integer.MAX_VALUE;
      if(houses[i]==0){
           for(int j=0;j<cost[i].length;j++){
              int minCostHere=Integer.MAX_VALUE;
              
              if(j+1==prevColor){

               minCostHere=helper(i+1,houses,cost,target,prevColor,neigh,dp);
                 }else{
                   minCostHere=helper(i+1,houses,cost,target,j+1,neigh+1,dp);
                    }
     
              if(minCostHere!=Integer.MAX_VALUE){ minCostHere+=cost[i][j];}
             minCost=Math.min(minCostHere,minCost);
              }
        }else{

          if(houses[i]==prevColor){
             minCost=helper(i+1,houses,cost,target,prevColor,neigh,dp);
                  }else{

               minCost=helper(i+1,houses,cost,target,houses[i],neigh+1,dp);
               }
         }

     return dp[i][prevColor][neigh]=minCost;
      }
}
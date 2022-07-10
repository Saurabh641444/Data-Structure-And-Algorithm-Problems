/*class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
        
        int arr[]=new int[n];
        
        for(int i=2;i<n;i++){
            cost[i]+=Math.min(cost[i-1],cost[i-2]);
        }
        
       return Math.min(cost[n-1],cost[n-2]);
    }
    
   
}*/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n=cost.length;
        
        int arr[]=new int[n];
        
        arr[0]=cost[0];
        arr[1]=cost[1];
        
        return new Recursion().solve(cost,2,n,arr);
       
    }
    
   
}

class Recursion{
    
    public int solve(int cost[],int i,int n,int []arr){
        if(i==n){
            return Math.min(arr[n-1],arr[n-2]); 
        }
         arr[i]=cost[i]+Math.min(arr[i-1],arr[i-2]);
         return solve(cost,i+1,n,arr);
    } 
}
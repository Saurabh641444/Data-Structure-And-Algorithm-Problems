class Solution 
{ 
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int N) 
    {        
        int[][] t=new int[N+1][W+1];
        for(int i=0;i<=N;i++){ t[i][0]=0;}
            for(int i=1;i<=W;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[N][W];
    } 
}

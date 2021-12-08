class Solution{
    public int cutRod(int price[], int N) {
        // code here
        
      
      
                int[][] t=new int[N+1][N+1];
                  int[] len = new int[N];
                   for(int i=0;i<N;i++){
                       len[i] = i+1;
                        }
        for(int i=0;i<=N;i++){ t[i][0]=0;}
            for(int i=1;i<=N;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(len[i-1]<=j){
                    t[i][j]=Math.max(price[i-1]+t[i][j-len[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[N][N];
    }
}

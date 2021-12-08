class Solution {
    public long count(int coins[], int N, int amount) {
        // code here.
          if (amount == 0) {
            return 0;
        }
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        
         long[][] t=new long[N+1][amount+1];
        for(int i=0;i<=N;i++){ t[i][0]=1;}
            for(int i=0;i<=amount;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    t[i][j]= t[i-1][j]+t[i][j-coins[i-1]];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[N][amount];
    }
}

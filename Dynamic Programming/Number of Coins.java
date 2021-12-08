class Solution{

	public int minCoins(int coins[], int N, int amount) 
	{ 
	    // Your c
       
         int[][] t=new int[N+1][amount+1];
        for(int i=1;i<=N;i++){ t[i][0]=0;}
            for(int i=0;i<=amount;i++){
              
                t[0][i]=Integer.MAX_VALUE-1;
            }
         
             
          for(int i=1;i<=amount;i++){
                  if(i%coins[0]==0){
                      t[1][i]=i/coins[0];
                  }else{
                      t[1][i]=Integer.MAX_VALUE-1;
                  }}
        // t[0][0]=0;
        for(int i=2;i<=N;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j){
                    t[i][j]= Math.min(t[i-1][j],1+t[i][j-coins[i-1]]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        if(t[N][amount]==Integer.MAX_VALUE-1){
        return -1;
    }
        return t[N][amount];
	} 
}

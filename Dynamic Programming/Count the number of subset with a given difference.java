class solution{
 public int count(int arr[],int n,int diff){
 int ArrSum=0;
 for(int i=0;i<n;i++){
  ArrSum+=arr[i];
   }
int sum=(diff+ArrSum)/2;
return perfectSum(arr,n, sum) ;
}
	private static int perfectSum(int arr[],int N, int sum) 
	{ 
	    // Your code goes here
	            // code here
        int[][] t=new int[N+1][sum+1];
        for(int i=0;i<N+1;i++){ t[i][0]=1;}
            for(int i=1;i<sum+1;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j]=(t[i-1][j-arr[i-1]] + t[i-1][j])%1000000007;
                }
                else{
                    t[i][j]=t[i-1][j]%1000000007;
                }
            }
        }
        return t[N][sum]%1000000007;
       
	} 
}
}

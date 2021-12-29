class Solution{
    static int[][] t=new int[1001][1001];
    static int palindromicPartition(String str)
    {
        // code here
        int N=str.length();
         for(int i=0;i<N+1;i++){
          for(int j=0;j<N+1;j++){
              t[i][j]=-1;
          }
      }
      return Solve(str,0,N-1); 
    }
        static int Solve(String str,int i,int j){
        if(i>=j) return 0;
        if(isPalindrome(str,i,j)==true) return 0;
        if(t[i][j]!=-1){
            return t[i][j];
        }
        int min=Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++){
            int left,right;
            if(t[i][k]!=-1){
                left=t[i][k];
            }else{
                left=Solve(str,i,k);
            }
             if(t[k+1][j]!=-1){
                right=t[k+1][j];
            }else{
                right=Solve(str,k+1,j);
            }
            
            int temp=1+left+right;
            if(temp<min){
                min=temp;
            }
        }
        
        return t[i][j]=min;
    }
    
    static boolean isPalindrome(String s,int i, int j){
        if(i==j) return true;
        
        if(i>j) return true;
        
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
                
            }
            i++;
                j--;
           
        }
         return true;
    }
}

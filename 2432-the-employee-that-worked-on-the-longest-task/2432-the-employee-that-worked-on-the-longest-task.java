class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int [] ans=new int[2];
        
        ans[0]=logs[0][0];
        ans[1]=logs[0][1];
        int max=ans[1];
        
        for(int i=1;i<logs.length;i++){
           int diff=logs[i][1]-logs[i-1][1];
            
            if(diff>ans[1]){
              ans[0]=logs[i][0];
              ans[1]=diff;     
            }else if(diff==ans[1] && logs[i][0]<ans[0]){
                 ans[0]=logs[i][0];
              ans[1]=diff; 
            }
            
          }
        
        return ans[0];
        
    }
}
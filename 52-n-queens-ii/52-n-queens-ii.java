class Solution {
     int count=0;
    public int totalNQueens(int n) {
        dfs(new int[n],0,n);
        return count;
    }

    public void dfs(int[] pos,int step,int n){
         if(step==n){ count++;
                    return;}
           
         for(int i=0;i<n;i++){
             pos[step]=i;
             if(isValid(pos,step)) dfs(pos,step+1,n);
              }
     }

     public boolean isValid(int[] pos,int step){
              for(int i=0;i<step;i++){
                 if(pos[i]==pos[step]||(Math.abs(pos[i]-pos[step])==(step-i))){ return false;}
               }
        return true;
     }
}
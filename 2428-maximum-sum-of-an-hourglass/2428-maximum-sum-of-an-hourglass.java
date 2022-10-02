class Solution {
    public int maxSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        int max=Integer.MIN_VALUE;
        
        
        for(int i=1;i<m-1;i++){
            boolean first=false,second=false,third=false;
            int preSum_first=0,preSum_third=0,preSum_sec=0;
            for(int j=1;j<n-1;j++){
                
       
                    preSum_first= ( grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1]);
                    first=true;
             
                    preSum_sec=grid[i][j];
                    second=true;
               
                    preSum_third= ( grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1]);
                    third=true;
                
                

                
                if(first && second && third){
                System.out.println(preSum_first);
                System.out.println(preSum_sec);
                System.out.println(preSum_third);
                    max=Math.max(max,preSum_first+preSum_sec+preSum_third);
                }
                
            }
        }
        
        return max;
    }
}
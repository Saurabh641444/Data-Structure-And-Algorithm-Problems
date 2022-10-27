class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans=0;
        
        for(int row=-img1.length+1;row<img1.length;row++){
            for(int col=-img2[0].length+1;col<img2.length;col++){
              ans=Math.max(ans,solve(img1,img2,row,col));  
            }
        }
        
        return ans;
    }
    
    private int solve(int [][] A,int[][] B,int row,int col){
        int count=0;
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                
                if(i+row<0 || i+row>= A.length || j+col<0 || j+col>=A[0].length){
                    continue;
                }
                
                if(A[i][j]+B[i+row][j+col]==2){
                    count++;
                }
            }
        }
        
        return count;
    }
}
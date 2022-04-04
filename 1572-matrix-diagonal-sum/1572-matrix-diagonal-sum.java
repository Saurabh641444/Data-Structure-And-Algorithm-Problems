class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
           
                sum+=mat[i][i];
            
        
        }
        
        int k=0;
        for(int j=mat.length-1;j>=0;j--){
            
            sum+=mat[j][k];
            k++;
            
        }
        
        int x=mat.length/2;
        if(mat.length%2!=0){
            sum-=mat[x][x];
        }
        
        return sum;
    }
}
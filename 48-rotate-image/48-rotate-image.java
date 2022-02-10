class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int ls=0;
            int rs=m-1;
            
            while(ls<=rs){
               int temp=matrix[i][ls];
                matrix[i][ls]=matrix[i][rs];
                matrix[i][rs]=temp; 
                 ls++;
            rs--;
            }
           
        }
        
    }
}
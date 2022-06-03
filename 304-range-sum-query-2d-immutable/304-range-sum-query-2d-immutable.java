class NumMatrix {
    int[][] ans;

    public NumMatrix(int[][] matrix) {
       ans=new int[matrix.length][matrix[0].length];
        populateArray(matrix,ans);
    }
    
    private void populateArray(int[][]matrix,int[][] ans){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j==0){
                    ans[i][j]=matrix[i][j];
                }else{
                    ans[i][j]=matrix[i][j]+ans[i][j-1];
                }
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
       if (row2 >= ans.length || col2 >= ans[0].length || row1 < 0 || col1 < 0)
			return -1;
		int sum = 0;
		for (int i = row1; i <= row2; i++) {
			sum = sum + (ans[i][col2] - (col1 > 0 ? ans[i][col1 - 1] : 0));
		}
		return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
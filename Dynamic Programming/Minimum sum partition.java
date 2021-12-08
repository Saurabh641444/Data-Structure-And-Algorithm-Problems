class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	   int sum=0;
	   for(int i=0; i<n; i++){
	        sum += arr[i];
	   }
	    
	   return subsetSum(arr, sum, n);
	} 
	
	private int subsetSum(int[] arr, int sum, int size) {
	    int row = size+1;
	    int col = sum+1;
	    int[][] t = new int[row][col];
        
        for (int i=0; i<col; i++) {
            t[0][i] = 0;
        }
        
        for (int i=0; i<row; i++) {
            t[i][0] = 1;
        }
        
        for (int i=1; i<row; i++) {
            for (int j=1; j<col; j++) {
                if (arr[i-1] > j) {
                   t[i][j] = t[i-1][j];
                }
                else {
                     t[i][j] = Math.max(t[i-1][j], t[i-1][j-arr[i-1]]);
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int j=0; j<= sum/2; j++) {
            if (t[row-1][j] == 1) {
                min = Math.min(min, sum-2*j);
            }
        }
        return min;
	}
}

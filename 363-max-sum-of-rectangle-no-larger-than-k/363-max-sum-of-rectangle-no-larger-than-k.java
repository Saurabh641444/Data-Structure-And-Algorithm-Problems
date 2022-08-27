class Solution {
    /*
    x
<--->
			y
<----------->

		y-x=k
	 <------>
    */
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int res=Integer.MIN_VALUE;
        
        for(int left=0;left<matrix[0].length;left++){
            
            int[] tempRowSum=new int[matrix.length];
            
            for(int right=left;right<matrix[0].length;right++){
                
                for(int row=0;row<matrix.length;row++){
                    
                    tempRowSum[row]+=matrix[row][right];
                }
                
                TreeSet<Integer> set=new TreeSet<>();
                set.add(0);
                int sum=0;
                
                for(int i:tempRowSum){
                   sum+=i;
                    
                    // sum is y here and target is x here. sum-k=y-k=x+k-k=x
                    Integer target=set.ceiling(sum-k);
                    // sum -target=y-x=k
                    if(target!=null){
                        res=Math.max(res,sum-target);
                    }
                    
                    set.add(sum);
                }
                
            }
        }
        
        return res;
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
     Queue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.add(matrix[i][j]);
            }
        }
        
        int j=0;
        int ans=0;
        
        while(pq.size()>0){
           int temp=pq.poll();
            if(j==k-1){
                ans=temp;
            }
            j++;
        }
        
        return ans;
    }
}

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        
       int[][] arr=new int[n][2];

       for(int i=0;i<n;i++){
            arr[i]=new int[]{efficiency[i],speed[i]};
          }

       Arrays.sort(arr,(int [] a,int[] b)->b[0]-a[0]);

       long result=0,speedSum=0;

       PriorityQueue<Integer> speedMinHeap=new PriorityQueue<>();

       for(int i=0;i<n;i++){
    
          int minEfficiency=arr[i][0];

          speedMinHeap.add(arr[i][1]);

          speedSum+=arr[i][1];
   
           if(speedMinHeap.size()>k) speedSum-=speedMinHeap.poll();

            result=Math.max(result,(minEfficiency*speedSum));
 
             }

          return (int) (result%1000000007);
        
    }
}
class Solution {
    public int maxResult(int[] nums, int k) {
       int n=nums.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(b[1]-a[1]));
        int max=nums[0];
        pq.add(new int[]{0,nums[0]});

        for(int i=1;i<nums.length;i++){

          while(i-pq.peek()[0]>k){ pq.poll();}

          int[] top=pq.peek();
          max=nums[i]+top[1];
          pq.add(new int[]{i,max});

        }

        return max;
    }
}
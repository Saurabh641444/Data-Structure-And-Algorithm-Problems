class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        // if(nu==1) return 0;
        
        if(nums[0]==0 &&  nums.length<=1) return 0;
        long [] prefix=new long[nums.length];
        long [] suffix=new long[nums.length];
        
        int n=nums.length;
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        
        for(int i=n-2;i>=0;i--){
            suffix[i]=nums[i]+suffix[i+1];
        }
        
        long min=Long.MAX_VALUE;
        int count=0;
        
        
        
        int minIndex=0;
        
        for(int i=0;i<n-1;i++){
            long avg=Math.abs((prefix[i]/(i+1))-(suffix[i+1]/(n-i-1)));
             // System.out.println(suffix[i+1]/(n-i-1));
            if(avg==0) count++;
            if(avg<min){
                min=avg;
                minIndex=i;
                
            }
         }
        
        long avg=Math.abs(prefix[n-1]/n);
        if(avg==0) count++;
         if(avg<min){
                min=avg;
                minIndex=n-1;
                
            }
        
        if(count==n) return 0;
        return minIndex;
        
    }
}
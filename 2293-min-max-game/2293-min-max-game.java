class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int n=nums.length;
        
        while(n>1){
            int k=0;
            int newNum[]=new int[n/2];
            for(int i=1;i<n;i=i+2){
                if(k==n/2) break;
                if(k%2==0){
                    newNum[k++]=Math.min(nums[i],nums[i-1]);
                }else{
                   newNum[k++]=Math.max(nums[i],nums[i-1]); 
                }
            }
            nums=newNum;
            n=n/2;
        }
        
        return nums[0];
    }
}
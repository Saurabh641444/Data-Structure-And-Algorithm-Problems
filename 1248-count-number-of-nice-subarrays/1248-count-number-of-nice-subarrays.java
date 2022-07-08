class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int flag=0;
        int count=0;
        int ans=0;
        while(j<n){
            
            if(nums[j]%2!=0) count++;
            
            while(count>k){
                if(nums[i]%2!=0) count--;
                i++;
                flag=i;
            }
            
            if(count==k){
                ans+=i+1-flag;
                
                while(nums[i]%2==0){
                    i++;
                    ans++;
                }
            }
            
            j++;
        }
        
        return ans;
    }
}
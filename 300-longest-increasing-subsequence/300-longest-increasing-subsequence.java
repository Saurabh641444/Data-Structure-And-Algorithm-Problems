class Solution {
    public int lengthOfLIS(int[] nums) {
       int size=0;
        int [] tails=new int[nums.length];
        for(int x:nums){
            int i=0,j=size;
            
            while(i!=j){
                int mid=(i+j)/2;
                
                if(tails[mid]<x){
                    i=mid+1;
                }else{
                    j=mid;
                }
            }
            tails[i]=x;
            if(i==size) size++;
        }
        
        return size;
    }
}
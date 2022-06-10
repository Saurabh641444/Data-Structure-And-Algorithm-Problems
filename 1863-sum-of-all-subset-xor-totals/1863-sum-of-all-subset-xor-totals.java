class Solution {
    public int subsetXORSum(int[] nums) {
     return solve(nums,0,0);
    }
    
    private int solve(int arr[],int index,int currentXor){
        if(index==arr.length) return currentXor;
     int withElement=solve(arr,index+1,currentXor^arr[index]);
       int withoutElement=solve(arr,index+1,currentXor);
    
    return withElement+withoutElement;
    }
}
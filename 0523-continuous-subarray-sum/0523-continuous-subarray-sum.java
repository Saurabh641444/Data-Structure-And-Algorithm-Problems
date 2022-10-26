class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       Map<Integer,Integer> hm=new HashMap<>(Map.of(0,0));
        
       int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(!hm.containsKey(sum%k)){
                hm.put(sum%k,i+1);
            }else if(hm.get(sum%k)<i){
                return true;
            }
            
        }
        return false;
    }
}
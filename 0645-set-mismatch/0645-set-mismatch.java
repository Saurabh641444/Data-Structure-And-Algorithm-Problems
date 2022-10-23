class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        Map<Integer,Integer> hm=new HashMap<>();
        
        
        
        
        for(int i=0;i<nums.length;i++){
           hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);    
        }
        
        for(int i=1;i<=nums.length;i++){
           if(hm.containsKey(i)==false){
               ans[1]=i;
           }
            else if(hm.get(i)==2){
                ans[0]=i;
            }
        }
        
        return ans;
    }
}
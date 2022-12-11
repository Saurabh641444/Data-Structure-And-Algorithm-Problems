class Solution {
    public int longestSquareStreak(int[] nums) {
       Arrays.sort(nums);
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=-1;
        
        for(int num:nums){
            int x=(int)Math.sqrt(num);
            
            if(x*x==num && hm.containsKey(x)){
               hm.put(num,hm.get(x)+1);
                ans=Math.max(ans,hm.get(x)+1);
            }else{
                hm.put(num,1);
            }
        }
        
        return ans;
    }
}
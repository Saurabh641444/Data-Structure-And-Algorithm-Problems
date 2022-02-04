class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max_len=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==0)? -1:1;
            if(sum==0) max_len=i+1;
            
            if(map.containsKey(sum)){
                max_len=Math.max(max_len,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max_len;
    }
}
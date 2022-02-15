class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> freqCount= new HashMap<>();
        int maxDegree=0;

         HashMap<Integer,Integer> firstIndex=new HashMap<>();
         int minLength=0;
        
         for(int i=0;i<nums.length;i++){
           firstIndex.putIfAbsent(nums[i],i);
            
           freqCount.put(nums[i],freqCount.getOrDefault(nums[i],0)+1);
           
           if(freqCount.get(nums[i])>maxDegree){
                      maxDegree=freqCount.get(nums[i]);
                      minLength=i-firstIndex.get(nums[i])+1;
               }
               else if(freqCount.get(nums[i])==maxDegree){
                     minLength=Math.min(minLength,i-firstIndex.get(nums[i])+1);
                      }
             }
        return minLength;
    }
}
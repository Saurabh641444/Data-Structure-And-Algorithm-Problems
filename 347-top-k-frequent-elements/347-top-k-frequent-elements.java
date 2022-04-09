class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                 map.put(nums[i],1);
            }
        }
    
     TreeMap<Integer,List<Integer>> tm=new TreeMap(Collections.reverseOrder());
      for(Integer key:map.keySet()){
            List<Integer> l=tm.getOrDefault(map.get(key),new ArrayList());
            l.add(key);
            tm.put(map.get(key),l);
       }

    int p=0;
    int[] ans=new int[k];
   for(Integer key:tm.keySet()){
       List<Integer> l=tm.get(key);
      for(Integer ele:l){
     ans[p++]=ele;
      if(p==k) return ans;
        }
     }
        
     return null;   
    }
}
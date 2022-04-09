/*class Solution {
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
}*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    List<Integer>[] bucket=new List[nums.length+1];
    HashMap<Integer,Integer> hm=new HashMap<>();

   for(int i=0;i<nums.length;i++){ hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);} 

   for(int key:hm.keySet()){
      int frequency =hm.get(key);
      if(bucket[frequency]==null){ bucket[frequency]=new ArrayList<>();}
      bucket[frequency].add(key);
    }
    int ans[]=new int[k];
   int count=0;
  for(int i=bucket.length-1;i>=0;i--){
       if(bucket[i]!=null){
            for(int j=0;j<bucket[i].size();j++){ ans[count++]=bucket[i].get(j);}
         }
      if(count==k) break;
      }
 return ans;
    }
}
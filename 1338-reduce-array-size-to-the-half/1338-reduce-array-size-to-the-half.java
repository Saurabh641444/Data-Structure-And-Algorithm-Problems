class Solution {
    public int minSetSize(int[] arr) {
        
        int size=arr.length,n=arr.length,res=0;
        Map<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
        (a,b)->{
            return b.getValue()-a.getValue();
           }
        );
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            pq.add(entry);
        }
        
        while(size>n/2){
            size-=pq.poll().getValue();
            res+=1;
        }
        return res;
    }
}
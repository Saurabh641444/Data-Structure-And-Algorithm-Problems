/*class Solution {
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
}*/

/*Bucket Sort*/

class Solution {
    public int minSetSize(int[] arr) {
        
     HashMap<Integer,Integer> hm=new HashMap<>();
     int n=arr.length;
        
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        int[] bucket=new int[n+1];
        ArrayList<Integer> list=new ArrayList<>(hm.values());
        
        for(int i:list){
            bucket[i]=++bucket[i];
        }
        
        int count=0;
        int sum=0;
        
        for(int i=bucket.length-1;i>=0;i--){
            while(bucket[i]>0){
                sum+=i;
                count++;
                if(sum>=n/2){
                    return count;
                }
                --bucket[i];
            }
        }
        
        return count;
        
    }
}
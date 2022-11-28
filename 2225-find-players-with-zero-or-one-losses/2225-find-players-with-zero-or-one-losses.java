class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
//         List<List<Integer>> ans=new ArrayList<>();
        
//         List<Integer> l1=new ArrayList<>();
//         Map<Integer,Integer> losers=new HashMap<>();
        
//         for(int i=0;i<matches.length;i++){
//             int win=matches[i][0];
//             int lose=matches[i][1];
            
//             l1.add(win);
//             losers.put(lose,losers.getOrDefault(lose,0)+1);
//         }
        
       
//         List<Integer> l2=new ArrayList<>();
       
//         List<Integer> l3=new ArrayList<>();
        
        
        
//          for(Map.Entry<Integer,Integer> e:losers.entrySet()){
//             if(e.getValue()==1){
//                 l2.add(e.getKey());
//             }
//         }
        
//         for(Integer k:l1){
//             if(losers.containsKey(k)){
//                 continue;
//             } else if(l3.contains(k)==false){
//                 l3.add(k);
//             }
//         }
        
//         Collections.sort(l3);
//         Collections.sort(l2);
//         ans.add(l3);
//         ans.add(l2);
        
//         return ans;
        
        int[] bucket=new int[100001];
        Arrays.fill(bucket,-1);
        
        for(int i=0;i<matches.length;i++){
            int win=matches[i][0];
            int lose=matches[i][1];
            
            if(bucket[win]==-1){
                bucket[win]=0;
            }
            
            if(bucket[lose]==-1){
                bucket[lose]=1;
            }else{
                bucket[lose]++;
            }
        }
        
        List<List<Integer>> ans=Arrays.asList(new ArrayList<>(),new ArrayList<>());
        
        for(int i=1;i<100001;i++){
            if(bucket[i]==0){
                ans.get(0).add(i);
            }else if(bucket[i]==1){
                ans.get(1).add(i);
            }
        }
        
        return ans;
    }
}
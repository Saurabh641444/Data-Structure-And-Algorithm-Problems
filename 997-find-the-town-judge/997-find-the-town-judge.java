class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
HashSet<Integer> hs=new HashSet<>();
HashMap<Integer,Integer> hm=new HashMap<>();

for(int i=0;i<trust.length;i++){
   hs.add(trust[i][0]);

    int key=trust[i][1];
    if(hm.containsKey(key)){
          hm.put(key,hm.get(key)+1);
     }else{
       hm.put(key,1);
       }
     
}
         for(Integer k:hm.keySet()){
            if(hm.get(k)==n-1 && hs.contains(k)==false){ return k;}
          }

return -1;
    }
}
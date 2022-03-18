class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
              }
       
        int i=0;
        String[] sol=new String[score.length];
        for(Integer val: map.values()){
          if(i==score.length-3){
              sol[val]="Bronze Medal";
            }
          else if(i==score.length-2){
               sol[val]="Silver Medal";
              }
           else if(i==score.length-1){
               sol[val]="Gold Medal";
                  }
           else{
              sol[val]=score.length-i+"";
              }
             i++;
            }
          return sol;
    }
}
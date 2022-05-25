class Solution {
    public int maxEnvelopes(int[][] envelopes) {
      
if(envelopes==null || envelopes.length==0|| envelopes[0]==null || envelopes[0].length!=2) { return 0;}

 Arrays.sort(envelopes,new  Comparator<int[]>(){
      public int compare(int[] first,int[] second){
                    if(first[0]==second[0]){ return second[1]-first[1];}
                    else{ return first[0]-second[0];}
               }

});

int dp[]=new int[envelopes.length];
int len=0;

for(int [] envelope:envelopes){

   int index=Arrays.binarySearch(dp,0,len,envelope[1]);
   if(index<0){ index=-(index+1);}
    dp[index]=envelope[1];
   if(index==len){ len++;}
}

return len;
    }
}
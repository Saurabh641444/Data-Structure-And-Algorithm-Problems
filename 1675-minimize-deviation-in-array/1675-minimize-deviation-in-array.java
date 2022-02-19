class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();
        
         for(int n:nums){ ts.add(n%2==0 ? n:n*2);}
         int diff=ts.last()-ts.first();
         
         while((ts.last() &1)==0){
           int last=ts.last();
           ts.remove(last);
           ts.add(last/2);

           diff=Math.min(diff,ts.last()-ts.first()); 
           }

         return diff;
 }
}
class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc=0;
        int exc=0;
        // int count=0;
        
        int count[]=new int[10001];
        for(int val:nums)count[val]++;
        for(int i=0;i<count.length;i++){
                  int newInc=exc+count[i]*i;
                  int newExc=Math.max(inc,exc);
                  inc=newInc;
                  exc=newExc;
                 
             }
        return Math.max(inc,exc);
    }
}
/*class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(a-b));
        
        for(int num:nums){
            pq.add(num);
        }
        
        int res=1;
        int prev=pq.poll();
        int max=1;
        while(pq.size()>0){
            int curr=pq.poll();
            if( curr==prev+1 ){ res++;
                              max=Math.max(res,max);}
            else if(curr-prev>1){
                res=1;
            }
            prev=curr;
        }
        
        return max;
    }
}*/

class Solution {
    public int longestConsecutive(int[] nums) {
      HashSet<Integer> set =new HashSet<>();
        
    for(int num:nums){set.add(num);}
        
        int LCS=0;
        
        for(int num:set){
            if(!set.contains(num-1)){
                int currNum=num;
                int streak=1;
                
                while(set.contains(currNum+1)){
                    currNum+=1;
                    streak+=1;
                }
                
                LCS=Math.max(streak,LCS);
            }
        }
        
        return LCS;
    }
}
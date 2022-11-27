class Solution {
    // int n;
    // int ans;
    public int numberOfArithmeticSlices(int[] nums) {
        // n=nums.length;
        // ans=0;
        // List<Long> cur=new ArrayList<>();
        // dfs(0,nums,cur);
        // return (int)ans;
        int n=nums.length;
        long ans=0;
        
        Map<Integer,Integer> [] count=new Map[n];
        
        for(int i=0;i<n;i++){
            count[i]=new HashMap<>();
            
          for(int j=0;j<i;j++){
              long delta=(long)nums[i]-(long)nums[j];
              
              if(delta<Integer.MIN_VALUE || delta>Integer.MAX_VALUE){
                  continue;
              }
              
              int diff=(int)delta;
              int sum=count[j].getOrDefault(diff,0);
              int origin=count[i].getOrDefault(diff,0);
              count[i].put(diff,origin+sum+1);
              ans+=sum;
              
          }    
        }
        
        return (int)ans;
    }
    
//     public void dfs(int j,int[] nums,List<Long> cur){
        
//         if(j==n){
//             if(cur.size()<3){
//                 return;
//             }
            
//             long diff=cur.get(1)-cur.get(0);
            
//             for(int i=1;i<cur.size();i++){
//                 if(cur.get(i)-cur.get(i-1)!=diff){
//                     return;
//                 }
//             }
            
//             ans++;
//             return;
//         }
        
        
//         dfs(j+1,nums,cur);
//         cur.add((long)nums[j]);
//         dfs(j+1,nums,cur);
//         cur.remove((long)nums[j]);
        
        
//     }
}
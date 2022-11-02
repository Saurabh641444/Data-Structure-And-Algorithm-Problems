class Solution {
    
    int min=Integer.MAX_VALUE;
    
    public int minMutation(String start, String end, String[] bank) {
        
      if(bank.length==0) return -1;
        
       dfs(start,end,bank,0,new HashSet<String>());
        
        
        return min==Integer.MAX_VALUE?-1:min;     
    }
    
    private void dfs(String start, String end, String[] bank,int count,HashSet<String> set){
        
        if(start.equals(end)){
            min=Math.min(min,count);
            return;
        }
        
        for(int i=0;i<bank.length;i++){
            if(diff(start,bank[i])==1 && !set.contains(bank[i])){
                set.add(bank[i]);
                dfs(bank[i],end,bank,count+1,set);
                set.remove(bank[i]);
            }
        }
        
    }
    
    private int diff(String a,String b){
        int count=0;
        
        for(int i=0;i<8;i++){
            if(a.charAt(i)!=b.charAt(i)) count++;
        }
        
        return count;
    }
}
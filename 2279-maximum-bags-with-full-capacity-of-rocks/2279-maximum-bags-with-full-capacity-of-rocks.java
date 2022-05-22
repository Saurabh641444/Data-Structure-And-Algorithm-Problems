class Solution {
    
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int [] diff=new int[rocks.length];
        
        for(int i=0;i<rocks.length;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        
        Arrays.sort(diff);
        int ans=0,count=0;
        for(int a:diff){
            count+=a;
            
            if(count>additionalRocks) break;
            
            ans++;
        }
        
        return ans;
    }
    
    
    
    
}
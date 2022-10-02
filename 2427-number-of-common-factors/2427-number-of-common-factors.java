class Solution {
    public int commonFactors(int a, int b) {
        
        int min=Math.min(a,b);
        
        int count=0;
        
        int div=1;
        
        while(div<min+1){
            
            if(a%div==0 && b%div==0){
                count++;
            }
            div++;
        }
        
        return count;
    }
}
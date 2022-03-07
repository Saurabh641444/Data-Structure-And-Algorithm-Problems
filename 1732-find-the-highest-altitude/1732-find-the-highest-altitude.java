class Solution {
    public int largestAltitude(int[] gain) {
       int num=0;
        int max=num;
        
        for(int a:gain){
            num=num+a;
            
            if(num>max){
                max=num;
            }
        }
        
        return max;
    }
}
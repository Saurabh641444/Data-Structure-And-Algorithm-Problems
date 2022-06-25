class Solution {
    public int countAsterisks(String s) {
       
        int count=0;
        int res=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='*'){
                if(count%2==0) res++;
            }else if(ch=='|'){
                count++;
            }
        }
        return res;
    }
}
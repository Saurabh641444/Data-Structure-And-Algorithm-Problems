class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;
        
        while(i>=0){
            if(s.charAt(i)=='#'){
                int num=Integer.parseInt(s.substring(i-2,i))-1;
                char ch=(char)(num+'a');
                ans.append(ch);
                i-=3;
            }else{
                int num=Integer.parseInt(s.substring(i,i+1))-1;
                char ch=(char)(num+'a');
                ans.append(ch);
                i--;
            }
            
            
        }
        
        ans.reverse();
        return ans.toString();
    }
}
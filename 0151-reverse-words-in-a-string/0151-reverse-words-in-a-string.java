class Solution {
    public String reverseWords(String s) {
           String [] ip=s.trim().split(" ");
           
           String ans="";
            
            for(int i=ip.length-1;i>=0;i--){
                if(ip[i].equals(" ")) continue;
                ans=ans+" "+ip[i];
            }
        
        return ans.replaceAll("\\s+"," ").trim();
    }
}
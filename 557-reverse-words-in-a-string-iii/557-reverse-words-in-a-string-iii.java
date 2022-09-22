class Solution {
    public String reverseWords(String s) {
        String ip[]=s.split(" ");
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<ip.length;i++){
          StringBuilder sb=new StringBuilder(ip[i]);
          sb.reverse();
            if(i==ip.length-1){
            ans.append(sb);

            }else{
            ans.append(sb+" ");
            }
        }
        
        return ans.toString();
        
    }
}
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] arr=new char[26];
        int i=0;
        for(char val='a';val<='z';val++){
            arr[i++]=val;
        }
        int z=0;
        for(int j=0;j<key.length();j++){
            char ch=key.charAt(j);
            
            if(!Character.isWhitespace(ch)&&!hm.containsKey(ch)){
                hm.put(ch,z);
                z++;
                 System.out.println(ch+" "+hm.get(ch));
            }
        }
        
        String ans="";
        for(int k=0;k<message.length();k++){
            char ch=message.charAt(k);
            if(Character.isWhitespace(ch)){
               ans=ans+" "; 
            }else{
            ans+=arr[hm.get(ch)];}
        }
        
       
        return ans;
        
    }
}

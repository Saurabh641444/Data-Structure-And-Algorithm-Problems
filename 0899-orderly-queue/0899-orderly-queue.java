class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }else{
            String res=s;
            
            for(int i=1;i<s.length();i++){
                String temp=s.substring(i)+s.substring(0,i);
                
                if(res.compareTo(temp)>0) res=temp;
            }
            
            return res;
        }
        
        
    }
}
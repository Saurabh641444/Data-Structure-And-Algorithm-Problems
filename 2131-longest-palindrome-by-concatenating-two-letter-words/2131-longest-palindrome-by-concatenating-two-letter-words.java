class Solution {
    public int longestPalindrome(String[] words) {
        
        int count=0;
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String str:words){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            String str=e.getKey();
            int val=e.getValue();
            
            StringBuilder sb=new StringBuilder(str);
            sb.reverse();
            String check=sb.toString();
            
            if(hm.containsKey(check)){
                
                if(check.equals(str)){
                    
                    if(val%2!=0){
                        val--;
                    }
                    
                    count+=(2*val);
                    hm.replace(str,hm.get(str)-val);
         
                }else{
                    
                    int min=Math.min(val,hm.get(check));
                    count+=(4*min);
                    
                    hm.replace(str,hm.get(str)-min);
                    hm.replace(check,hm.get(check)-min);
 
                   }
                
                }
        }
        
          for(Map.Entry<String,Integer> e:hm.entrySet()){
            String str=e.getKey();
            int val=e.getValue();
            
            if(str.charAt(0)==str.charAt(1) && val>0){
            
                    count+=2; 
                break;
            }
          }
        
        return count;
        
    }
}
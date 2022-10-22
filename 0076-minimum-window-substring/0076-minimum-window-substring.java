class Solution {
    public String minWindow(String s, String t) {
       int n1=s.length();
       int n2=t.length();
        
       if(n2>n1) return "";
        
        String ans="";
        
        Map<Character,Integer> hm1=new HashMap<>();
        
        for(int i=0;i<n2;i++){
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        
        int i=0;
        int count=0;
        
        Map<Character,Integer> hm2=new HashMap<>();
        
        
        int min=Integer.MAX_VALUE;
        
        for(int j=0;j<n1;j++){
            char ch=s.charAt(j);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
            
            if(hm1.containsKey(ch) && hm2.get(ch)<=hm1.get(ch)){
                count++;
            }
            
                while(count==n2){
                 
                        if(j-i+1<min){
                            ans=s.substring(i,j+1);
                            min=j-i+1;
                            
                        }
                  
                    char curr=s.charAt(i);
                    
                    if(hm2.get(curr)==1){
                        hm2.remove(curr);
                    }else{
                        hm2.put(curr,hm2.get(curr)-1);
                    }
                    i++;
                    
                    if(hm1.containsKey(curr) && hm1.get(curr)>hm2.getOrDefault(curr,0)){
                        count--;
                    }

                   

                   }
        }
        
        return ans;
    }
}
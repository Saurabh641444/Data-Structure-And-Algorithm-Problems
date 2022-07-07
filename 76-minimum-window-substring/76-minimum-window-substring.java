class Solution {
    public String minWindow(String s, String t) {
    int count=0;
    int start=0;
    int minWindow=Integer.MAX_VALUE;
    String res="";
    
    HashMap<Character,Integer> hm1=new HashMap<>();
    HashMap<Character,Integer> hm2=new HashMap<>();
    
    for(char ch:t.toCharArray()){
      hm2.put(ch,hm2.getOrDefault(ch,0)+1);
       }
     
     for(int i=0;i<s.length();i++){
         hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);

         if(hm2.containsKey(s.charAt(i)) &&hm1.get(s.charAt(i))<= hm2.get(s.charAt(i)) ){
                count++;
               }

         while(count==t.length()){
             if(minWindow >i-start+1){
                  minWindow=i-start+1;
                   res=s.substring(start,i+1);
                  }

               char curr=s.charAt(start);
               
               if(hm1.get(curr)==1){ hm1.remove(curr);}
               else{ hm1.put(curr,hm1.get(curr)-1);}
                 
               start++;

                     if(hm2.containsKey(curr) &&hm1.getOrDefault(curr,0)< hm2.get(curr) ){
                count--;
               }

              }
      }
     
     return res;
        
    }
}
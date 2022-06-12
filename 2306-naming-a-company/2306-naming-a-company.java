/*class Solution {
    public long distinctNames(String[] ideas) {
        long count=0;
        HashSet<String> set=new HashSet<>();
        
         for(int i=0;i<ideas.length;i++){
             set.add(ideas[i]);
         }
        
        for(int i=0;i<ideas.length;i++){
            for(int j=0;j<ideas.length;j++){
            String str1=ideas[i];
            String str2=ideas[j];
            
            char c1=str1.charAt(0);
            char c2=str2.charAt(0);
            
            String str3=str1.substring(1);
             String str4=str2.substring(1);
            
            str3=c2+""+str3;
            str4=c1+""+str4;
            
           
            
            if(!set.contains(str4) && !set.contains(str3) ){
               count++;
                 System.out.println(str3);
            System.out.println(str4);
            }
            }
        }
        
        return count;
    }
}*/
class Solution {
    public long distinctNames(String[] ideas) {
    
   HashSet<String> [] map=new HashSet[26];
    
    for(int i=0;i<26;i++){
            map[i]=new HashSet<>();
         }       

     for(String idea:ideas){
       char c=idea.charAt(0);
       map[c-'a'].add(idea.substring(1));
       }
       long res=0;
       for(int i=0;i<25;i++){
           for(int j=i+1;j<26;j++){
           HashSet<String> set1=map[i];
           HashSet<String> set2=map[j];
           int nomore=0;
           for(String s:set1){
              if(set2.contains(s)){
                  nomore++;
              }
           }
           
           res+=(set1.size()-nomore)*(set2.size()-nomore)*2;
           }
       }
       
       return res;

    }
}
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> list = new ArrayList<Integer>();
//         if(p.length() > s.length()) return  list;
       
//             int N = s.length(); 
//             int M = p.length();
//             int[] count = frequency(p);
            
//             int[] currentCount = frequency(s.substring(0, M));
            
//             if(areSame(count, currentCount)) 
//                 list.add(0);
        
//             int i;
//             for(i = M; i < N; i++){
//                 currentCount[s.charAt(i - M) - 'a']--;
//                 currentCount[s.charAt(i) - 'a']++;
//                 if(areSame(count, currentCount)){
//                     list.add(i - M + 1);
//                 }
//             }
        
//         return list;
//     }
    
//     private boolean areSame(int[] x, int[] y){
//         for(int i = 0; i < 26; i++){
//             if(x[i] != y[i])
//                 return false;
//         }
        
//         return true;
//     }
    
//     private int[] frequency(String s){
//         int[] count = new int[26];
//         for(int i = 0; i < s.length(); i++){
//             count[s.charAt(i) - 'a']++;
//         }
        
//         return count;
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     int st=0;
     int e=p.length()-1;
     List<Integer> ans=new ArrayList<Integer>();
     if(p.length()>s.length()|| st>e){ return ans;}
     HashMap<Character,Integer> hms=new HashMap<>();//create HashMap for first string
     HashMap<Character,Integer> hmp=new HashMap<>();// create the HashMap for secoind string
     
        // put the characters in the second string
     for(int i=0;i<p.length();i++){
      char ch=p.charAt(i);
      hmp.put(ch,hmp.getOrDefault(ch,0)+1);
          }

        // put the character in the first stying
      for(int i=0;i<=e;i++){
      char ch=s.charAt(i);
      hms.put(ch,hms.getOrDefault(ch,0)+1);
          }
      
      if(hms.equals(hmp)) ans.add(st); // if both hashMap are equal then add character start index in the ans  
    
      st++;e++;
      while(e<s.length()){ // end pointer should be less than length of first string
        //add key for e
        char ch=s.charAt(e);
        hms.put(ch,hms.getOrDefault(ch,0)+1);

       // remove key for st

     ch=s.charAt(st-1);
     if(hms.containsKey(ch)){
      hms.put(ch,hms.get(ch)-1);
       
       if(hms.get(ch)==0) {hms.remove(ch);}
    }
     
       if(hms.equals(hmp)){ans.add(st);}
       st++;e++;
             }
      
      return ans;
    }
}
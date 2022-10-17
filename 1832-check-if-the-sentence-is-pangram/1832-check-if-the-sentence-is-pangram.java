class Solution {
    /*
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        
        return set.size()==26;
    }*/
    
     public boolean checkIfPangram(String sentence) {
       
         int seen=0;
         
         for(int i=0;i<sentence.length();i++){
             char ch=sentence.charAt(i);
             
             int index=ch-'a';
             
             int currBit=1<<index;
             
             seen|=currBit;
         }
       
         return seen==(1<<26)-1;
    }
}
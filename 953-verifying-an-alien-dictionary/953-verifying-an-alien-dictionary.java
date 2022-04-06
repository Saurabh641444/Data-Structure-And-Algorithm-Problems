class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
              if(!isNeighborsSorted(words[i],words[i+1],order)){
                        return false;
                 }}
        return true;
        
    }

    public static boolean isNeighborsSorted(String word1,String word2,String order){
       for(int i=0;i<word1.length();i++){
            if(i==word2.length()){ return false;}

            char char1=word1.charAt(i);
            char char2=word2.charAt(i);

             if(char1==char2) continue;
               
             int num1=order.indexOf(char1);
             int num2=order.indexOf(char2);
              return num2>num1;
            }
        return true;
       }
}
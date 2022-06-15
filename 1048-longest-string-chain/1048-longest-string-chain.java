class Solution {
    public int longestStrChain(String[] words) {
        
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int max=0;
        
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String word:words){
            int LS=0;
            for(int i=0;i<word.length();i++){
                String subWord=word.substring(0,i)+word.substring(i+1);
                LS=Math.max(LS,hm.getOrDefault(subWord,0)+1);
            }
            hm.put(word,LS);
            max=Math.max(max,LS);
        }
        
        return max;
        
    }
}
class WordFilter {
    HashMap<String,Integer> hm;
    public WordFilter(String[] words) {
        hm=new HashMap<>();
        for(int index=0;index<words.length;index++){
             for(int i=0;i<words[index].length();i++){
                  String prefix=words[index].substring(0,i+1);
                   for(int j=words[index].length()-1;j>-1;j--){
                       String suffix=words[index].substring(j);
                       hm.put(prefix+"#"+suffix,index);
                     }
                  }
         }
    }
    
    public int f(String prefix, String suffix) {
        return hm.getOrDefault(prefix+"#"+suffix,-1);
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
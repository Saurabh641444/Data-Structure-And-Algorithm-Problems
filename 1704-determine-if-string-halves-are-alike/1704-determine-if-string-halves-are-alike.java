class Solution {
    public boolean halvesAreAlike(String s) {
      
        int count1=0;
        int count2=0;
        
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                if(isVowel(s.charAt(i))){
                    count1++;
                }
            }else{
               if(isVowel(s.charAt(i))){
                    count2++;
                } 
            }
        }
        
        System.out.println(count1+" "+count2);
        
        if(count1!=count2) return false;
        
        return true;
    }
    
    private boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        
        return false;
    }
}
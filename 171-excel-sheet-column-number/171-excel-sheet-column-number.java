class Solution {
    public int titleToNumber(String columnTitle) {
        int position=0;
        for(int i=0;i<columnTitle.length();i++){
            position=position*26;
            
            for(int j='A';j<='Z';j++){
                position++;
                
                if(j==columnTitle.charAt(i)){
                    break;
                }
            }
        }
        
        return position;
    }
}
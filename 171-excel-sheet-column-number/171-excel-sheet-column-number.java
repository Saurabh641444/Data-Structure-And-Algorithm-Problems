class Solution {
    public int titleToNumber(String s) {
//         int position=0;
//         for(int i=0;i<columnTitle.length();i++){
//             position=position*26;
            
//             for(int j='A';j<='Z';j++){
//                 position++;
                
//                 if(j==columnTitle.charAt(i)){
//                     break;
//                 }
//             }
//         }
        
//         return position;
        
        int ans=0;
         int p=0;
        for(int i=s.length()-1;i>=0;i--){
               char c=s.charAt(i);
               int val=(int)c-65+1;
               ans+=val*Math.pow(26,p);
                p++;

            }
             return ans;
    }
}
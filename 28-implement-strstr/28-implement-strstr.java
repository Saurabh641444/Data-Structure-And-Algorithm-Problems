class Solution {
    public int strStr(String haystack, String needle) {
       int h=haystack.length();
//        int n=needle.length();

//       if(n==0){ return 0;}

//        for(int i=0;i<h;i++){
//          int j;   
//            for(j=0;j<n && (i+j)<h;j++){
//             if(haystack.charAt(i+j)==needle.charAt(j)){
//               continue;
//               }else{
//                  break;    
//                }
//       }
//        if(j==needle.length()){ return i;}
//             }

// return -1; 
        
        if(needle.equals(" "))
            return 0;
        
        return haystack.indexOf(needle)>=0 ? haystack.indexOf(needle):-1;
    }
}
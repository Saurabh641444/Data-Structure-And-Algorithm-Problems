class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int left[]=new int[n];
        int right[]=new int[n];
        
        char prev='.';
        
        for(int i=0;i<n;i++){
            char curr=dominoes.charAt(i);
            if(prev=='R' && curr=='.'){
                
               if(i==0){
                   right[i]=1;
               }else{
                   right[i]=right[i-1]+1;
               }
                
               prev='R';
            }else{
                prev=curr;
            }
            
        }
        
        prev='.';
        for(int i=n-1;i>=0;i--){
             char curr=dominoes.charAt(i);
            if(prev=='L' && curr=='.'){
               if(i==n-1){
                   left[i]=1;
               }else{
                   left[i]=left[i+1]+1;
               }
                prev='L';
            }else{
            prev=curr;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<n;i++){
            char curr=dominoes.charAt(i);
            if(left[i]==0 && right[i]==0){
               sb.append(""+dominoes.charAt(i)+""); 
            }else if(left[i]==0){
                sb.append(""+'R'+"");
            }else if(right[i]==0 ){
                sb.append(""+'L'+"");     
            }else if(left[i]==right[i]){
                sb.append(""+'.'+"");
             
            }else if(left[i]>right[i]){
                sb.append(""+'R'+"");
            }else{
                sb.append(""+'L'+""); 
            }
        }
        
    // System.out.println(left[n-1]+" "+right[n-1]);
        return sb.toString();
    }
}
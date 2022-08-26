class Solution {
    public int minFlips(String s) {
        int n=s.length();
        s=s+s;
        
        char t[]=s.toCharArray();
        char a[]=new char[n+n];
        char b[]=new char[n+n];
        
        for(int i=0;i<n+n;i++){
            if(i%2==0){
                a[i]='1';
                b[i]='0';
            }else{
                a[i]='0';
                b[i]='1';
            }
        }
        
        int first=0,second=0,min=Integer.MAX_VALUE;
        
        for(int i=0;i<n+n;i++){
            
            if(a[i]!=t[i]) first++;
            
            if(b[i]!=t[i]) second++;
            
            if(i>=n){
                if(a[i-n]!=t[i-n]) first--;
            
                if(b[i-n]!=t[i-n]) second--;  
            }
            
            if(i>=n-1){
                min=Math.min(min,Math.min(first,second));
            }
            
        }
        
       return min; 
    }
}
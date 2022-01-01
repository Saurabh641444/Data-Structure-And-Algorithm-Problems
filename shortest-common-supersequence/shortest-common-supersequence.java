class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
       //Your code here
        int x = s1.length();
		int y = s2.length();
        int[][] t=new int[x+1][y+1];
       
        for(int i=0;i<=x;i++){ 
            t[i][0]=0;
            
        }
            for(int i=0;i<=y;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
              if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        
       
        }  
    //   return x+y- t[x][y]; 
         String str="";
    

    
     int i=x;
     int j=y;
     
     while(i>0 && j>0){
         if(s1.charAt(i-1)==s2.charAt(j-1)){
                   str+=(s1.charAt(i-1));
                    i--;
                    j--;
                   
                }else{
                   if(t[i-1][j]>t[i][j-1]){
                       str+=(s1.charAt(i-1));
                       i--;
                     
                   }else{
                        str+=(s2.charAt(j-1));
                       j--;
                        
                   }
                }
     }
     
     while(i>0){
             str+=(s1.charAt(i-1));
                       i--;
                        
     }
     
          while(j>0){
             str+=(s2.charAt(j-1));
                       j--;
                       
     }
       
     
                  String str2 = reversed(str);
                  return str2;
    
    }

    
     static String reversed(String input){
	        StringBuilder str = new StringBuilder(input);
                          str.reverse();
                  String str1 = str.toString();
                  return str1;  
    }
}
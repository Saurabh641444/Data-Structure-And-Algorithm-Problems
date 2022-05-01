class Solution {
     public static String removeDigit(String number, char digit) {
      /*  
        int len=number.length();
          if(len>100){ return "-1";}
        int count=0;
        String ans="";
        String maxS="";
        
         if(len>100){ return "-1";}
      Stack<Integer> st=new Stack<>();
        for(int i=0;i<len;i++){
            char ch=number.charAt(i);
            if(ch==digit){
                count++;
                st.push(i);
            }
        }
        
        int max=Integer.MIN_VALUE;
        if(count==1){
            for(int i=0;i<len;i++){
            char ch=number.charAt(i);
            if(ch!=digit){
                ans+=""+ch;
            }
                maxS=ans;
               
        }
        }else if(count>1){
            while(count!=0 && !st.isEmpty() ){
                boolean run=true;
                ans="";
             for(int i=0;i<len;i++){
            char ch=number.charAt(i);
            if(ch==digit  && run==true && st.peek()==i){
               count--;
               
                run=false;
                st.pop();
                // continue;
            }else {
                  ans+=""+ch;
               
            }
               
        }
        //  System.out.println(ans+"\n");
                if(Integer.parseInt(ans)>max){
                    max=Integer.parseInt(ans);
                    maxS=ans;
                }
            }
        }
        
        return maxS;*/
         
         String ans="",temp;
int n=number.length();

for(int i=0;i<n;i++){
     
   char ch=number.charAt(i);
   if(ch==digit){

     temp=number.substring(0,i)+number.substring(i+1);

     if(ans.equals("")){
       ans=temp;
       }else if(ans.compareTo(temp)<0){
          ans=temp;
          }
    }
}


return ans;
    }
}
class Solution {
    public String multiply(String num1, String num2) {
       int m=num1.length();
       int n=num2.length();
        
       int[] arr=new int[n+m];
        
        if(m==0|| n==0||"0".equals(num1)||"0".equals(num2)){
            return "0";
        }
        
        if("1".equals(num1)){ return num2;}
        if("1".equals(num2)){ return num1;}
      
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                
                // now add carry
                mul=mul+arr[i+j+1];
                
                //add value to the ans
                arr[i+j+1]=mul%10;
                arr[i+j]+=mul/10;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int res:arr){
            
            if(sb.length()==0 && res==0){continue;}
            sb.append(res);
        }
        
        return sb.toString();
    }
}
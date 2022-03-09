class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.isEmpty()){ return num2;}
        else if(num2.isEmpty()){ return num1;}
        
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        
        StringBuilder ss=new StringBuilder();
        
        while(i>=0 || j>=0){
            int n1= i>=0? num1.charAt(i)-'0':0;
            int n2= j>=0? num2.charAt(j)-'0':0;
            int temp=n1+n2+carry;
            ss.append((char)(temp%10+'0'));
            carry=temp/10;
            
            i--;
            j--;
        }
        
        if(carry>0){ ss.append((char)(carry+'0'));}
        
        ss=ss.reverse();
        return ss.toString();
    }
}
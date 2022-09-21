class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        
        int left=0;
        int right=n-1;
        if(n==1) return "";
        while(left<right){
            char ch=palindrome.charAt(left);
            
            if(ch!='a'){
                StringBuilder sb=new StringBuilder(palindrome);
                sb.setCharAt(left,'a');
                return sb.toString();
            }else{
                left++;
                right--;
            }
        }
        
                StringBuilder sb=new StringBuilder(palindrome);
                sb.setCharAt(n-1,'b');
                return sb.toString();
    }
}
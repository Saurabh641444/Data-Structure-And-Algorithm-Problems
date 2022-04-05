class Solution {
    public String reverseVowels(String s) {
       
        char [] arr=s.toCharArray();
        
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            if(isVowel(arr[i])&&isVowel(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(arr[i])){
                i++;
            }
           else  if(!isVowel(arr[j])){ j--;}
        }
      return new String(arr);
    }
    
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i'  || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        
        return false;
        
    }
    
    
}
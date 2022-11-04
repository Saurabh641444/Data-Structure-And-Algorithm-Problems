/*class Solution {
    public String reverseVowels(String s) {
        String vowels="";
        String ans="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'  ){
                vowels=vowels+""+ch;
            }
            
        }
        
        int j=vowels.length()-1;
        
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
                ans=ans+""+vowels.charAt(j--);
            }else{
                 ans=ans+""+ch;
            }
            
        }
        
        return ans;
    }
}*/

class Solution {
    public String reverseVowels(String s) {
       char arr[]=s.toCharArray();
        
        int i=0;
        int j=arr.length-1;
        
        while(i<j){
            char a=arr[i];
            char b=arr[j];
            
        if(isVowel(a) && isVowel(b)){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }else if(isVowel(a)){
            j--;
        }   else if(isVowel(b)){
            i++;
        }else {
            i++;
            j--;
        }
            
        }
        return new String(arr);
    }
    
    private static boolean isVowel(char ch){
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
             return true;
         }
        
        return false;
    }
}
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr=sentence.trim().split(" ");
        
        String first=arr[0];
        String last=arr[arr.length-1];
        
        if(first.charAt(0)!=last.charAt(last.length()-1)){
            return false;
        }else{
            
            for(int i=0;i<arr.length-1;i++){
                if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0)) return false;
            }
        }
        
        return true;
    }
}
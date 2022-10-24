class Solution {
    int max;
    public int maxLength(List<String> arr) {
        max=0;
        
        dfs(arr,"",0);
        
        return max;
    }
    
    private void dfs(List<String> arr,String currString,int index){
        
         max=Math.max(currString.length(),max);
        
        for(int i=index;i<arr.size();i++){
            if(!isValid(currString,arr.get(i))) continue;
            dfs(arr,currString+arr.get(i),i+1);
        }
    }
    
    private boolean isValid(String currString,String newString){
        int arr[]=new int[26];
        
        for(int i=0;i<newString.length();i++){
            
            if(++arr[newString.charAt(i)-'a']==2) return false;
            
            if(currString.contains(newString.charAt(i)+"")) return false;
        }
        
        return true;
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxNum=0;
        for(int i=0;i<sentences.length;i++){
          
            String str=sentences[i];
            String[] strArr=str.split(" ");
            maxNum=Math.max(maxNum,strArr.length);
        }
        
        return maxNum;
    }
}
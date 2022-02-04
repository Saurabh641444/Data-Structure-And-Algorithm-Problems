class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
           int area=(end-start)*Math.min(height[start],height[end]);
           if(max<area){max=area;}
           if(height[start]<height[end]){start++;}
           else{end--;}
     }
     return max;// space O(1) time O(N)
    }
}
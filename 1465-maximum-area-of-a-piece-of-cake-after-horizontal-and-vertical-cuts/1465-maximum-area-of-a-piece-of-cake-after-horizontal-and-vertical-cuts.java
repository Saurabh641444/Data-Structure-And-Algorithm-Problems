class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int maxh=Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int maxv=Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
                                                             
        for(int i=1;i<horizontalCuts.length;i++){
            maxh=Math.max(maxh,horizontalCuts[i]-horizontalCuts[i-1]);
        }
                                                             
        for(int j=1;j<verticalCuts.length;j++){
            maxv=Math.max(maxv,verticalCuts[j]-verticalCuts[j-1]);
        }
                                                             
       return(int)( (long)maxh*maxv%1000000007);
    }
}
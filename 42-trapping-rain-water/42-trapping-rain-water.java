class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] mxL=new int[n];
        int[] mxR=new int[n];
         mxL[0]=height[0];
        for(int i=1;i<n;i++){
        mxL[i]=Math.max(height[i],mxL[i-1]);
            }
        mxR[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
           mxR[i]=Math.max(height[i],mxR[i+1]);
          }
        int[] water=new int[n];
        int sum=0;
       for(int i=0;i<n;i++){
         water[i]=Math.min(mxL[i],mxR[i])-height[i];
        sum+=water[i];
        }
        return sum;//o(n)
    }
}
class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
         int ans=Integer.MIN_VALUE;
        int current_product=1;
        for(int i=0;i<n;i++){
            current_product=current_product*arr[i];
            ans=Math.max(current_product,ans);
            if(current_product==0){
                current_product=1;
                
            }
        }
        current_product=1;
        for(int i=n-1;i>=0;i--){
            current_product=current_product*arr[i];
            ans=Math.max(current_product,ans);
            if(current_product==0){
                current_product=1;
                
            }
        }
       
       return ans; 
    }
}
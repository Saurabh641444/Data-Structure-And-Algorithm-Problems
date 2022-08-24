class Solution {
    public static boolean makeEven(int N, int[] arr) {
        // code here
        int even=0;
        int odd=0;
        if(N%2==1) return false;
        for(int i=0;i<N;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        
        if(even==N) return true;
        if(odd%2==1 && even%2==1) return false;
        if(N%2==1) return false;
        
        return true;
    }
}

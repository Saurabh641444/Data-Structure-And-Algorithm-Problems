class Solution {
    public int countVowelStrings(int n) {
        /*
            a e i o u
            1 1 1 1 1
   n=1      5 4 3 2 1
   n=2      15 10 6 3 1
        */
        int p[]=new int[]{1,1,1,1,1};
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=p.length-1;j>=0;j--){
                p[j]=p[j]+sum;
                sum=p[j];
            }
        }
        
        return p[0];
    }
}
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        // Arrays.sort(arr);
//         int i=0;
//         int n=arr.length;
//         long count=0;
//         long mod=1000000007;
//         while(i<n){
//             int newTarget=target-arr[i];
//             int l=i+1;
//             int r=n;
//            HashMap<Integer,Integer> map=new HashMap<>();
            
//             for(int j=l;j<r;j++){
//                 if(map.get(newTarget-arr[j])!=null){
//                     count+=map.get(newTarget-arr[j]);
//                 }
                
//                 if(map.get(arr[j])!=null){
//                     map.put(arr[j],map.get(arr[j])+1);
//                 }else{
//                     map.put(arr[j],1);
//                 }
//             }
            
//             i++;
//         }
        
//         return (int)(count%mod);
        
        long ans=0;
int MOD=1_000_000_007;
long[] c=new long[101];
for(int i:arr) c[i]++;

for(int i=0;i<101;i++){
for(int j=0;j<101;j++){
   int k=target-i-j;
   if(k<0 || k>100) continue;
   if(i==j&&j==k) {
       ans+=(c[i]*(c[i]-1)*(c[i]-2)/6);
      }else if(i==j&&j!=k){
       ans+=(c[i]*(c[i]-1)/2)*(c[k]);
       }else if(i<j&&j<k){
          ans+=(c[i]*c[j]*c[k]);
          }
 }
}

return (int)(ans%MOD);
    }
}
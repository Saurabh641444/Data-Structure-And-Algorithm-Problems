class Solution {
    public int threeSumMulti(int[] arr, int target) {
        // Arrays.sort(arr);
        int i=0;
        int n=arr.length;
        long count=0;
        long mod=1000000007;
        while(i<n){
            int newTarget=target-arr[i];
            int l=i+1;
            int r=n;
           HashMap<Integer,Integer> map=new HashMap<>();
            
            for(int j=l;j<r;j++){
                if(map.get(newTarget-arr[j])!=null){
                    count+=map.get(newTarget-arr[j]);
                }
                
                if(map.get(arr[j])!=null){
                    map.put(arr[j],map.get(arr[j])+1);
                }else{
                    map.put(arr[j],1);
                }
            }
            
            i++;
        }
        
        return (int)(count%mod);
    }
}
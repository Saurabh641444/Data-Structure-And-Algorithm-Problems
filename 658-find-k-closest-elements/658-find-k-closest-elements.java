class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans=new ArrayList<>();
        
        int i=0;
        int j=arr.length-1;
        
        while(j-i+1>k){
            if(Math.abs(arr[i]-x)>Math.abs(arr[j]-x)){
                i++;
            }else if(Math.abs(arr[i]-x)<=Math.abs(arr[j]-x)){
                j--;
            }
        }
        
        for(int z=i;z<=j;z++){
            ans.add(arr[z]);
        }
        
        return ans;
        
    }
}
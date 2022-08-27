class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();

       Arrays.sort(candidates);// nlogn

       findCombinations(0,candidates,target,ans,new ArrayList<>());
       return ans;//space k*x time 2^n*k
    }

    private void findCombinations(int ind,int[] arr,int target, List<List<Integer>> ans, List<Integer> ds){
        
      if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
    }

       for(int i=ind;i<arr.length;i++){
             if(i>ind && arr[i]==arr[i-1]) continue;// If previous element sis similar to the current then skip recursion call
            
            if(arr[i]>target) break;// don't do recursion if we reach beyond target         

          ds.add(arr[i]);
          findCombinations(i+1,arr,target-arr[i],ans,ds);
           ds.remove(ds.size()-1);
           }
      
    }
    
}
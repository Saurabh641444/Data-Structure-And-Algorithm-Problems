/*class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int count=0;
        
        while(l<r){
            if(nums[l]+nums[r]==k){
                count++;
                l++;
                r--;
            }else if(nums[l]+nums[r]<k){
                l++;
            }else if(nums[l]+nums[r]>k){
                r--;
            }
        }
        
        return count;
    }
}*/

class Solution {
    public int maxOperations(int[] nums, int k) {
      
      HashMap<Integer,Integer> hm=new HashMap<>();
        int count=0;
        
        for(int num:nums){
            if(hm.containsKey(k-num)&& hm.get(k-num)>0){
                count++;
                hm.put(k-num,hm.get(k-num)-1);
            }else{
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
            
        }
        
     
        return count;
    }
}
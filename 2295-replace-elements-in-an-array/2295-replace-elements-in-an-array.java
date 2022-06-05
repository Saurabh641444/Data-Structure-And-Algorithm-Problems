class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int arr[]=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            arr[i]=nums[i];
        }
        
        for(int i=0;i<operations.length;i++){
            int index=map.get(operations[i][0]);
            arr[index]=operations[i][1];
            map.remove(operations[i][0]);
            map.put(operations[i][1],index);
        }
        return arr;
    }
}
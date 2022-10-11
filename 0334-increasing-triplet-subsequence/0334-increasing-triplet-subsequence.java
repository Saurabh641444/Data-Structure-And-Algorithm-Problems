class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        /* Here we just need to maintain the record of first minimum and second minimum */
        for(int num:nums){
            
            if(num<=min){
                min=num;
            }else if(num<secondMin){
                secondMin=num;
            }else if(num>secondMin){
                return true;
            }
            
        }
        
        return false;
    }
}
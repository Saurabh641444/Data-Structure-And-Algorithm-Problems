class NumArray {
   private  int[] nums;
     private int [] b;
     private int len;
     public NumArray(int[] nums) {
       this.nums=nums;
       double l=Math.sqrt(nums.length);
       len=(int) Math.ceil(nums.length/l);
       b=new int[len];
       for(int i=0;i<nums.length;i++){
           b[i/len]+=nums[i];
       }
        
    }
    
    public void update(int index, int val) {
        
        int b_l=index/len;
        b[b_l]=b[b_l]-nums[index]+val;
        nums[index]=val;
    }
    
    public int sumRange(int i, int j) {
        int sum=0;
        
        int s=i/len;
        int e=j/len;
        
        if(s==e){
            for(int k=i;k<=j;k++){
                sum+=nums[k];
            }
        }else{
            
            for(int k=i;k<=(s+1)*len-1;k++){
                sum+=nums[k];
              }
            
            for(int k=s+1;k<=e-1;k++){
                sum+=b[k];
              }
            
            for(int k=e*len;k<=j;k++){
                sum+=nums[k];
              }
            
            
            
        }
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
class Solution {
    public int candy(int[] ratings) {
      int count[]=new int[ratings.length];
        Arrays.fill(count,1);
        
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                 count[i]=count[i+1]+1;
            }
           
        }
        
        int ans=0;
        
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i+1]>ratings[i]){
                 count[i+1]=Math.max(1+count[i],count[i+1]);
            }
            ans+=count[i];
        }
        
        return ans+count[ratings.length-1];
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
       Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count=0; 
        
        while(i<=j){
            int sum=people[i]+people[j];
             if(sum<=limit){
                count++;
                
                i++;
                j--;
                 
            }else if(sum>limit){
                count++;
                j--;
            }
        }
        return count;
    }
}
// class Solution {
//     public int numRescueBoats(int[] people, int limit) {
//        Arrays.sort(people);
//         int i=0;
//         int j=people.length-1;
//         int count=0; 
        
//         while(i<=j){
//             int sum=people[i]+people[j];
//              if(sum<=limit){
//                 count++;
                
//                 i++;
//                 j--;
                 
//             }else if(sum>limit){
//                 count++;
//                 j--;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int i,j;
        int count=0;
         for(i=0,j=n-1;i<=j;j--){
           if(people[i]+people[j]<=limit){
           i++; 
           }
          count++;
     }
     return count;
    }
}
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n=numbers.length;
//         int start=0, end=n-1;

//         while(start<end){
//               if(numbers[start]+numbers[end]>target){
//         end--;
// }else if(numbers[start]+numbers[end]<target){
//         start++;
//          }else{
//             return new int[]{start+1,end+1};
//               }
//            }
//        return new int[]{};//space O(1), time O(N);
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int end=numbers.length-1;
      for(int i=0;i<numbers.length;i++){

        int start=i+1;
        while(start<=end){
           int mid=start+(end-start)/2;
             if(numbers[i]+numbers[mid]>target){
            end=mid-1;
          }else if(numbers[i]+numbers[mid]<target){
             start=mid+1;
            }else{
                return new int[]{i+1,mid+1};
               }
            
        }
      }
        return new int[2];
    }}
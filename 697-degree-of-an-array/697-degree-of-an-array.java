class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> freqCount= new HashMap<>();
        int maxDegree=0;

         HashMap<Integer,Integer> firstIndex=new HashMap<>();
         int minLength=0;
        
         for(int i=0;i<nums.length;i++){
           firstIndex.putIfAbsent(nums[i],i);
            
           freqCount.put(nums[i],freqCount.getOrDefault(nums[i],0)+1);
           
           if(freqCount.get(nums[i])>maxDegree){
                      maxDegree=freqCount.get(nums[i]);
                      minLength=i-firstIndex.get(nums[i])+1;
               }
               else if(freqCount.get(nums[i])==maxDegree){
                     minLength=Math.min(minLength,i-firstIndex.get(nums[i])+1);
                      }
             }
        return minLength;
    }
}



// class Solution
// {
// public int findShortestSubArray(int[] nums)
// {
// HashMap<Integer,Integer> freCount=new HashMap<>();//for counting the frequency of particular element
// int maxDegree=0;//maximum frequency of element

//     HashMap<Integer,Integer> firstIndex=new HashMap<>();//for storing the first index of maximum frequency to get minimum subarray
//     int minLength=0;//minimum length of subarray that contins the element with maximum degree
    
//     for(int i=0;i<nums.length;i++)//traversing the nums array
//     {
//         firstIndex.putIfAbsent(nums[i],i);//putIfAbsent stores in the map if the key is not present//actually it stores the firstv index in a map format 
            
//         freCount.put(nums[i], freCount.getOrDefault(nums[i],0)+1);//counting  the the frequency of element //detOrDefault returns the default value if the key is not present, it assotiates with its default value//here it is used to to store the frequency of every element in the array
        
//         if(freCount.get(nums[i])>maxDegree)//getting the the maximum frequency or the degree of the array 
//         {
//             maxDegree=freCount.get(nums[i]);//storing the maximum degree by comparing with the corresponding key->value in the HashMap
            
//             minLength=i-firstIndex.get(nums[i])+1;//storing the minimum length for the element with max degrees 
//         }
//         else if(freCount.get(nums[i])==maxDegree)//if the degree is same getting the minimum length
//         {
//             minLength=Math.min(minLength,i-firstIndex.get(nums[i])+1);//getting the minimum length with previous and current length  
//         }
//     }
//     return minLength;//returning the minimum length 
// }
// '''
// }
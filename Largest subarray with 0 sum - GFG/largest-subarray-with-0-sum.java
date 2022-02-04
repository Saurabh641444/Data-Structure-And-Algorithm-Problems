// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends

//Brut force approach Time complexity O(N^2) space O(N)
// class GfG
// {
//     int maxLen(int arr[], int n)
//     {
//         // Your code here
//         int max_len=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
                
//                 if(sum==0){
//                     max_len=Math.max(max_len,j-i+1);
//                 }
//             }
            
//         }
        
//         return max_len;
//     }
// }

/*Algorithm:  

Create an extra space, an array of length n (prefix), a variable (sum), length (max_len), and a hash map (hm) to store the sum-index pair as a key-value pair.
Move along the input array from the start to the end.
For every index, update the value of sum = sum + array[i].
Check every index, if the current sum is present in the hash map or not.
If present, update the value of max_len to a maximum difference of two indices (current index and index in the hash-map) and max_len.
Else, put the value (sum) in the hash map, with the index as a key-value pair.
Print the maximum length (max_len).*/

class GfG
{
    // Approach by using HashMap Space O(N) time O(N)
    int maxLen(int arr[], int n)
    {
        // Your code here
        int max_len=0;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(arr[i]==0 && max_len==0){
                max_len=1;
            }
            
            if(sum==0){
                max_len=i+1;
            }
            
            Integer prev_i=map.get(sum);
            if(prev_i!=null){
                max_len=Math.max(max_len,i-prev_i);
            }else{
                map.put(sum,i);
            }
            
        }
        
        return max_len;
    }
}
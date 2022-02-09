// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        // int[] res=new int[n/2];
        // int t=0;
        // ArrayList<Integer> res=new ArrayList<>();
        Set hset=new HashSet<Integer>();
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
           
                if(arr[i]==arr[i-1]){
                    // res[t]=arr[i];
                    // t++;
                    
                    hset.add(new Integer(arr[i]));
                }
            
        }
        // Convert set to ArrayList and Sort
        ArrayList res=new ArrayList<Integer>(hset);
        Collections.sort(res);
         if(res.size()==0){
            res.add(-1);
             
         }
             return res;
        
    }
}

// class Solution {
//   public static ArrayList<Integer> duplicates(int arr[], int n) {
//       //sorted the array
//       Arrays.sort(arr);
//       Set setData = new HashSet<Integer>();
//       for (int i=1;i<n;i++) {
//           //check if adjecents are equal, then assign to set
//           if (arr[i]==arr[i-1]) {
//               setData.add(new Integer(arr[i]));
//           }
//       }
//       //convert set to arraylist and sort
//       ArrayList arrList = new ArrayList<Integer>(setData);
//       Collections.sort(arrList);
//       if (arrList.size()==0) {
//           arrList.add(-1);   
//       }
//       return arrList;
//   }
// }
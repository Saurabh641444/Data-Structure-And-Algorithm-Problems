// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        // for(int i=0;i<n;i++){
        //     if(arr[i]!=0){
        //         return i;
        //     }
        // }
        // return -1;
        if(n==1 && arr[0]==1){return 0;}
        if(n==1 && arr[0]!=1){return -1;}
        int mid=n/2;
        if(arr[mid]==1 && arr[(mid-1)]==0) return mid;
        if(arr[mid]==1 && arr[(mid-1)]==1){
            for(int i=0;i<mid;i++){
                if(arr[i]!=0){
                    return i;
                }
            }
        }
        
        if(arr[mid]==0){
            for(int i=mid;i<n;i++){
                if(arr[i]!=0){
                    return i;
                }
            }
        }
        
        return -1;
    }
}
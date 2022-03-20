// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
/*class Solution {
    public int maxArea(int arr[][], int n, int m) {
        // add code here.
        // ArrayList<Integer> list=new ArrayList<>();
        int[] a=arr[0];
        
       int maxarea=MAH(a,m);
      int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    a[k++]=0;
                }else{
                    a[k++]+=arr[i][j];
                }
                k=0;
                maxarea=Math.max(maxarea,MAH(a,m));
            }
        }
        return maxarea;
    }
    public static int MAH(int[] arr,int m){
        int right[]=NSR(arr,m);
        int left[]=NSL(arr,m);
        int res=0;
               
        for(int i=0;i<m;i++){
            
            res=Math.max(res,arr[i]*(right[i]-left[i]-1));
             
        }
        return res;
    }
    
   static  int[] NSL(int[] arr,int m){
        int left[]=new int[m];
         Stack<Integer> stl=new Stack<>();
         for(int i=0;i<m;i++){
          
           
     while(!stl.isEmpty() &&arr[stl.peek()]>=arr[i]){stl.pop();}
                 if(stl.isEmpty()){
                left[i]=-1;
            }else {
                left[i]=stl.peek();
            }
            
            stl.push(i);
        }
        
        return left;
    }
    
    static int[] NSR(int [] arr,int m){
         Stack<Integer> str=new Stack<>();
         int[] right=new int[m];
        for(int i=m-1;i>=0;i--){
            
                while(!str.isEmpty() &&arr[str.peek()]>=arr[i]){str.pop();}
                 if(str.isEmpty()){
               right[i]=arr.length;
            }else {
                right[i]=str.peek();
            }
            
            str.push(i);
        }
        
        int k=m-1;
        for(int i=0;i<m/2;i++){
             int temp=right[i];
               right[i]=right[k];
               right[k]=temp;
               k--;
               }
               return right;
    }
    
}*/

class Solution {
    //previous smaller element
    int[] previoussmaller(int arr[]){
        int ps[] = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i] = -1;
            }
            else{
                ps[i] = s.peek();
            }
            s.push(i);
        }
        return ps;
    }
    
    //next smaller element
    int[] nextsmaller(int arr[]){
        int ns[] = new int[arr.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i] = arr.length;
            }
            else{
                ns[i] = s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    int getArea(int arr[], int n){
        int ps[] = previoussmaller(arr);
        int ns[] = nextsmaller(arr);
        int maxarea = 0;
        for(int i=0; i<n; i++){
            int area = ((ns[i] - ps[i]) -1) * arr[i];
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }
    public int maxArea(int M[][], int n, int m) {
        int arr[] = M[0];
        int maxarea = getArea(arr, m);
        int k=0;
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                if(M[i][j] == 0){
                    arr[k++] = 0;
                }
                else{
                    arr[k++] += M[i][j];
                }
            }
            k=0;
            int currentarea = getArea(arr, m);
            maxarea = Math.max(maxarea, currentarea);
        }
        return maxarea;
    }
}
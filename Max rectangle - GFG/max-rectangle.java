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
class Solution {
    
     int[] NSL(int[] arr,int m){
        int left[]=new int[arr.length];
         Stack<Integer> stl=new Stack<>();
         for(int i=0;i<arr.length;i++){
          
           
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
    
    int[] NSR(int [] arr,int m){
         Stack<Integer> str=new Stack<>();
         int[] right=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            
                while(!str.isEmpty() &&arr[str.peek()]>=arr[i]){str.pop();}
                 if(str.isEmpty()){
               right[i]=arr.length;
            }else {
                right[i]=str.peek();
            }
            
            str.push(i);
        }
        
      
               return right;
    }
    
      int MAH(int[] arr,int m){
        int right[]=NSR(arr,m);
        int left[]=NSL(arr,m);
        int res=0;
               
        for(int i=0;i<m;i++){
            int area=arr[i]*((right[i]-left[i])-1);
            res=Math.max(res,area);
             
        }
        return res;
    }
    
     public int maxArea(int M[][], int n, int m) {
        // add code here.
        // ArrayList<Integer> list=new ArrayList<>();
        int[] arr=M[0];
        
       int maxarea=MAH(arr,m);
       int k=0;
        for(int i=1;i<n;i++){
           
            for(int j=0;j<m;j++){
                if(M[i][j]==0){
                    arr[k++]=0;
                }else{
                    arr[k++]+=M[i][j];
                }
               
               
            }
             k=0;
              int currentarea=MAH(arr,m);
              maxarea=Math.max(maxarea,currentarea);
        }
        return maxarea;
    }
    
}
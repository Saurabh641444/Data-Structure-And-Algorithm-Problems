package DynamicProgramming;
import java.util.*;
import java.io.*;
public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=new int[]{30,10,60,10,60,50};
        int dp[]=new int[arr.length+1];
        Arrays.fill(dp,-1);
//        System.out.println(solve(arr,arr.length-1,dp));/////////////////////////
        
        System.out.println(spaceOptimization(arr));
	}
	
	private static int spaceOptimization(int arr[]){
		int prev1=0,prev2=0;
		
		for(int i=1;i<arr.length;i++){
			int firstStep=prev1+Math.abs(arr[i]-arr[i-1]);
			int secondStep=Integer.MAX_VALUE;
			
			if(i>1) secondStep=prev2+Math.abs(arr[i]-arr[i-2]);
			
			int curr=Math.min(firstStep,secondStep);
			prev2=prev1;
			prev1=curr;
		}
		
		return prev1;
	}
	private static int tabulation(int arr[]){
		int n=arr.length;
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
		
		
		for(int i=1;i<n;i++){
			int twoStep=Integer.MAX_VALUE;
			int a=Math.abs(arr[i]-arr[i-1]);
			int oneStep=dp[i-1]+a;
			if(i>1){
			int b=Math.abs(arr[i]-arr[i-2]);
			twoStep=dp[i-2]+b;
			}
			dp[i]=Math.min(oneStep, twoStep);
		}
		return dp[n-1];
	}
	
	private static int solve(int[] arr,int n,int dp[]){
		
		if(n<=0) return 0;
		
		if(dp[n]!=-1) return dp[n];
		int oneStep=solve(arr,n-1,dp)+Math.abs(arr[n]-arr[n-1]);
		
		int twoStep=Integer.MAX_VALUE;
        
		if(n-2>-1){
		twoStep=solve(arr,n-2,dp)+Math.abs(arr[n]-arr[n-2]);
		}
		
		return dp[n]= Math.min(oneStep, twoStep);
	}

}

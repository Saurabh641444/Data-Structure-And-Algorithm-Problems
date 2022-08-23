/*
Given N and M, find the minimum number of primes required to make N, you can use the first M primes to do so.. [N <= 10^3] [M<=10^4] 
Input: 
N = 10 
M = 1 
Output: 
5 
Explanation: Minimum we require 5 primes [2 + 2 + 2 + 2 + 2] 
Input: 
N = 11 
M = 3 
Output: 
3
Explanation: Minimum we require 3 primes [5 + 3 + 2] 
*/
package array;
import java.util.*;
import java.io.*;
public class PrimeNumTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(solution(10,1));
	}
	
	public static int solution(int N,int M) {
		ArrayList<Integer> list=new ArrayList<>();
		int len=Math.max(N, M);
		int count=0;
		for(int i=0;i<=len;i++) {
			if(isPrime(i)) {
				list.add(i);
				count++;
			}
			
			if(count==M) break;
		}
		

		
		ArrayList<Integer> ans=new ArrayList<>();
		
		return solve(list,N,list.size(),ans);
		
		
	}
	
	private static int solve(ArrayList<Integer> arr, int target,int n,ArrayList<Integer> ans) {
		
		if(target==0) return ans.size();
		
		if(target<0) return Integer.MAX_VALUE;
		
		if(n==0) return Integer.MAX_VALUE;
		
		int x=solve(arr,target,n-1,ans);
		
		ans.add(arr.get(n-1));
		
		int y=solve(arr,target-arr.get(n-1),n,ans);
		
		ans.remove(ans.size()-1);
		
		return Math.min(x, y);
	}
	
	private static boolean isPrime(int n) {
		if(n<=1)  return false;
		if(n==2 || n==3) return true;
		
		if(n%2==0 || n%3==0) return false;
		
		for(int i=5;i*i<n;i=i+6) {
			if(n%i==0 || n%(i+2)==0) {
				
				return false;
			}
		}
		
		return true;
	}

}

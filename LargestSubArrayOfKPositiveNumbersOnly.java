import java.io.*;
import java.util.*;
public class LargestSubArrayOfKPositiveNumbersOnly {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine().trim());
        
        while(T-->0) {
        	 int n=Integer.parseInt(br.readLine().trim());
        	String[] str=br.readLine().trim().split(" ");
        	int arr[]=new int[n];
        	for(int i=0;i<str.length;i++) {
        		arr[i]=Integer.parseInt(str[i]);
        	}
        	
        	int k=Integer.parseInt(br.readLine().trim());
        	A obj=new A();
        	System.out.println(obj.helper(arr,n,k));
        	
        }
	}

}

class A{
	A(){}
	public  int helper(int [] arr,int n,int sum) {
		int max=0;
		int k=sum;
		sum=0;
		int i=0;
		int j=0;
		
		while(j<n) {
			sum+=arr[j];
			
			if(sum<k) {
				j++;
			}else if(sum==k) {
				max=Math.max(max, j-i+1);
				j++;
				sum-=arr[i];
				i++;
			}else {
				while(sum>k) {
					sum-=arr[i];
					i++;
					if(sum==k) {
						max=Math.max(max, j-i+1);
						sum-=arr[i];
						break;
					}
				}
				j++;
			}
		}
		return max;
	}
}

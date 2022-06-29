// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        String[] keyboard={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans=new ArrayList<>();
        
        solve(a,N,keyboard,ans,"",0);
        return ans;
    }
    
    static void solve(int a[],int N,String[] keyboard,ArrayList<String> ans,String op,int index){
        
        if(op.length()==N){
            ans.add(op);
            return;
        } 
        
        
            String str=keyboard[a[index]];
            for(int j=0;j<str.length();j++){
                solve(a,N,keyboard,ans,op+str.charAt(j),index+1);
            }
        
    }
}



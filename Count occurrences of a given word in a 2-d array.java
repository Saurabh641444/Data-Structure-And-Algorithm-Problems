//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
        
        Integer nextInt(){
            return Integer.parseInt(next());
        }
    } 
    
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t>0)
        {
            int R = sc.nextInt();
            int C = sc.nextInt();
            
            char mat[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
            String target  = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.findOccurrence(mat,target));
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findOccurrence(char mat[][], String target)
    {
        // Write your code here
        
        int r=mat.length;
        int c=mat[0].length;
        
        boolean[][] vis=new boolean[r][c];
        
        int count[]=new int[1];
        int n=target.length();
        boolean[] track=new boolean[n];
        
        int [][] dir={{-1,0},{0,1},{1,0},{0,-1}};
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==target.charAt(0) && vis[i][j]==false){
                    
                    vis[i][j]=true;
                      
                    
                    dfs(i,j,0,r,c,n,track,dir,target,mat,count,"");
                    
                }
            }
        }
        
        return count[0];
    }
    
    private void dfs(int i, int j, int k, int r,int c, int n, boolean[] track, int[][] dir,
    String target,char mat[][],int [] count,String str){
          
          char ch=target.charAt(k);
        
        if(mat[i][j]==target.charAt(k)){
         track[k]=true;
         
         str=str+""+target.charAt(k);
        
            k++;
            
            if(str.equals(target)){ count[0]++;

                return;}
     
            
        }
        
        mat[i][j]='.';
        for(int x[]:dir){
          
                int new_x=i+x[0];
                int new_y=j+x[1];
                
                if(new_x>=0 && new_y>=0&& new_x<r && new_y<c && k<n && mat[new_x][new_y]==target.charAt(k)){
                    
                   
                    dfs(new_x,new_y,k,r,c,n,track,dir,target,mat,count,str);
                    
                }
            
        }
        mat[i][j]=ch;
        
    }
}

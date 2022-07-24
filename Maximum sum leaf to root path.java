class Solution
{
    public static int maxPathSum(Node root)
    {
        //code here
       return dfs(root,0,0);
    }
    
    public static int  dfs(Node root, int sum,int max){
        
        if(root==null) return max;
        
        sum=sum+root.data;
        max=Math.max(sum,max);
        return Math.max(dfs(root.left,sum,max),dfs(root.right,sum,max));
    }
}

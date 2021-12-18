class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] nums,int l, int r){

    if(l>r) return null;
    if(l==r) return new TreeNode(num[l]);
     
    int mid=(l+r)/2;
    TreeNode root=new TreeNode(nums[1]);

    root.left=helper(nums,l,mid-1);
    root.right=helper(nums,mid+1,r);
    return root;
}
}

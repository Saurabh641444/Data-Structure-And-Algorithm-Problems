/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preIndex = 0;

    public TreeNode constructTree(int[] inorder, int[] preorder, int is, int ie, HashMap<Integer, Integer> map) {
        if (is > ie) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int inIndex = map.get(root.val);
        root.left = constructTree(inorder, preorder, is, inIndex - 1, map);
        root.right = constructTree(inorder, preorder, inIndex + 1, ie, map);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        TreeNode root = constructTree(inorder, preorder, 0, inorder.length - 1, map);
        return root;
    }
}
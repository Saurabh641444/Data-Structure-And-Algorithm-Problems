/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return " ";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        q.add(root);
        // sb.append("");
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            
            if(temp==null) {sb.append("n ");
                           continue;}
           sb.append(temp.val+" ");
            q.add(temp.left);
            q.add(temp.right);
        }
      return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==" ") return null;
        
        Queue<TreeNode> q=new LinkedList<>();
        String ip[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(ip[0]));
        q.add(root);
        int i=1;
        for(;i<ip.length;i++){
            TreeNode temp=q.poll();
            
            if(!ip[i].equals("n")){
                temp.left=new TreeNode(Integer.parseInt(ip[i]));
                q.add(temp.left);
            }
            
             if(!ip[++i].equals("n")){
                 temp.right=new TreeNode(Integer.parseInt(ip[i]));
                q.add(temp.right);
            }
           
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
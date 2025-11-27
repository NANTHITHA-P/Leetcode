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
    public void preOrder(TreeNode root,StringBuilder s){
        if(root==null){
            s.append("null,");
            return;
        }
        s.append(Integer.toString(root.val)).append(",");
        preOrder(root.left,s);
        preOrder(root.right,s);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();//creating a memory space it is not holding anything at this moment
        preOrder(root,s);
        return s.toString();
    }
   private TreeNode hp(List<String> l){
      if(l.get(0).equals("null")){
        l.remove(0);
        return null;
      }
      TreeNode root = new TreeNode(Integer.parseInt(l.get(0)));
      l.remove(0);
      root.left = hp(l);
      root.right = hp(l);
      return root;
   }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> l = new LinkedList<>(Arrays.asList(arr));
        return hp(l);
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
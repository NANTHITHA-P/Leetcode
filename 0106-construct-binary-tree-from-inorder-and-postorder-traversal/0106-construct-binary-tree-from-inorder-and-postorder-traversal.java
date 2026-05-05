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
    int index =0;
    public TreeNode helper(int[] postorder,int s,int e,Map<Integer,Integer> map){
        if(s>e) return null;
        int rootval = postorder[index--];
        TreeNode root = new TreeNode(rootval);
        int in = map.get(rootval);
        root.right = helper(postorder,in+1,e,map);
        root.left = helper(postorder,s,in-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index = postorder.length-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1,map);
    }
}
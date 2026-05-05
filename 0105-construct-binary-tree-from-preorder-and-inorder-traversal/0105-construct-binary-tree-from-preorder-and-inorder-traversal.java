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
    int index = 0;
    public TreeNode helper(int[] preorder,int s,int e,Map<Integer,Integer> map){
        if(s>e) return null;
        int rootval = preorder[index++];
        TreeNode root = new TreeNode(rootval);
        int index = map.get(rootval);
        root.left = helper(preorder,s,index-1,map);
        root.right = helper(preorder,index+1,e,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1,map);
    }
}
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
    public int hm(TreeNode root,int[] max){//find max path and update in max array
        if(root==null){
            return 0;
        }
        int l = Math.max(0,hm(root.left,max));
        int r = Math.max(0,hm(root.right,max));
        int cur = root.val + l + r;
        max[0] = Math.max(cur,max[0]);
        return root.val+Math.max(l,r) ;
    }
    public int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        hm(root,max);
        return max[0];
    }
}
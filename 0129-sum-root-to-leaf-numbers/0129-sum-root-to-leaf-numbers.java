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
    public void helpersum(List<Integer> l,TreeNode root,int p){
        if(root.left == null && root.right!=null){
            p = p*10+root.val;
            helpersum(l,root.right,p);
            return;
        }
        if(root.left != null && root.right==null){
            p = p*10+root.val;
            helpersum(l,root.left,p);
            return;
        }
        if(root.left == null && root.right==null){
           p = p*10+root.val;
           l.add(p);
           return;
        }
        p = p*10+root.val;
        helpersum(l,root.left,p);
        helpersum(l,root.right,p);
    }
    public int sumNumbers(TreeNode root) {
         List<Integer> arr = new ArrayList<>();
         helpersum(arr,root,0);
         int ans = 0;
         for(int a : arr){
            ans+=a;
         }
         return ans;
    }
}
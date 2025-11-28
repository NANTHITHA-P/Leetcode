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
    List<TreeNode> constructBST(int s,int e){
        List<TreeNode> trees = new ArrayList<>();
        if(s>e){
            trees.add(null);
            return trees;
        }
        for(int i = s;i<=e;i++){
            List<TreeNode> lt = constructBST(s,i-1);
            List<TreeNode> rt = constructBST(i+1,e);
            for(TreeNode left : lt){
                for(TreeNode right : rt){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    trees.add(root);
                }
            }
        }
            return trees;
    }
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        return constructBST(1,n);
    }
}
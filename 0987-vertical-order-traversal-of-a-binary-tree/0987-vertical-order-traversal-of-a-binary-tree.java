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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,List<Integer>>> map = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[]{root,0,0});
        while(!q.isEmpty()){
           Object[] cur = q.poll();
           TreeNode node = (TreeNode)cur[0];
           int row = (int)cur[1];
           int col = (int)cur[2];
           map.putIfAbsent(col,new TreeMap<>());
           map.get(col).putIfAbsent(row,new ArrayList<>());
           map.get(col).get(row).add(node.val);
           if(node.left!=null){
            q.offer(new Object[]{node.left,row+1,col-1});
           }
           if(node.right!=null){
            q.offer(new Object[]{node.right,row+1,col
            +1});
           }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(TreeMap<Integer,List<Integer>> m : map.values()){
            List<Integer> list = new ArrayList<>();
            for(List<Integer> vals:m.values()){
                Collections.sort(vals);
                list.addAll(vals);
            }
            res.add(list);
        }
        return res;
    }
}  
class Solution {
    public void sum(int[] c,int t,int i,int s,List<List<Integer>> res,List<Integer> temp){
        if(s == t){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i>=c.length || s>t) return;
        temp.add(c[i]);
        sum(c,t,i,s+c[i],res,temp);
        temp.remove(temp.size()-1);
        sum(c,t,i+1,s,res,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
       sum(candidates,target,0,0,res,new ArrayList<>());
       return res; 
    }
}
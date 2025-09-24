class Solution {
    public void sum(int[] c,int t,int start,List<List<Integer>> res,List<Integer> temp){
        if(t == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<c.length;i++){
            if(c[i]>t) break;
            temp.add(c[i]);
            sum(c,t-c[i],i,res,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(candidates);
       sum(candidates,target,0,res,new ArrayList<>());
       return res; 
    }
}
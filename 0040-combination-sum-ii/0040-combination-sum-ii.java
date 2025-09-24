class Solution {
    public void combine(int[] c,int t,int i,int sum,List<List<Integer>> res,List<Integer> temp){
        if(sum==t){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(i>=c.length || sum>t) return;
        temp.add(c[i]);
        combine(c,t,i+1,sum+c[i],res,temp);
        temp.remove(temp.size()-1);
        while(i<c.length-1 && c[i]==c[i+1]) i++;
        combine(c,t,i+1,sum,res,temp);
    }
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combine(candidates,target,0,0,res,new ArrayList<>());
        return res;
    }
}
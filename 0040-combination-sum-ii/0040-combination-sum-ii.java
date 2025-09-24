class Solution {
    public void combine(int[] c,int t,int index,List<List<Integer>> res,List<Integer> temp){
        if(t == 0){
           // if(!res.contains(temp))
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<c.length;i++){
            if(c[i]>t) break;
            temp.add(c[i]);
            combine(c,t-c[i],i+1,res,temp);
            while(i<c.length-1 && c[i]==c[i+1]) i++;//to remove duplicates
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        combine(candidates,target,0,res,new ArrayList<>());
        return res;
    }
}
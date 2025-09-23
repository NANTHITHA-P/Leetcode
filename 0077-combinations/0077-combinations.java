class Solution {
    public void combine(List<List<Integer>> res,int n,int s,int k,List<Integer> temp){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(s>n) return;
        temp.add(s);
        combine(res,n,s+1,k,temp);
        temp.remove(temp.size()-1);
        combine(res,n,s+1,k,temp);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combine(res,n,1,k,new ArrayList<>());
        return res;
    }
}
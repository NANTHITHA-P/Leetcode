class Solution {
    public void combine(int k,int n,int s,List<List<Integer>> res,List<Integer> temp){
        if(temp.size()==k && n==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(temp.size()>k || n<0) return;
        for(int i=s;i<=9;i++){
            if(i>n) break;
            temp.add(i);
            combine(k,n-i,i+1,res,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        combine(k,n,1,res,new ArrayList<>());
        return res;
    }
}
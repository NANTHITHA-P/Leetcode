class Solution {
    public void subset(List<List<Integer>> res,int[] nums,int i,List<Integer> temp){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(res,nums,i+1,temp);
        temp.remove(temp.size()-1);
        subset(res,nums,i+1,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(res,nums,0,new ArrayList<>());
        return res;
    }
}
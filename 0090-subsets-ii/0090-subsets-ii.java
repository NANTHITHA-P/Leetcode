class Solution {
    public void subset(List<List<Integer>> res,int[] nums,int i,List<Integer> temp){
        if(i==nums.length){
           if(!res.contains(temp))
            res.add(new ArrayList<>(temp));
        return;
        }
        temp.add(nums[i]);
        //if(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        subset(res,nums,i+1,temp);
        temp.remove(temp.size()-1);
        if(i<nums.length-1 && nums[i]==nums[i+1]) i++;
        subset(res,nums,i+1,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
         subset(res,nums,0,new ArrayList<>());
         return res;
    }
}
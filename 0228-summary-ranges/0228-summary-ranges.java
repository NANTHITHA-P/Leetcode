class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();
        if(nums.length == 0) return li;
        String str = String.valueOf(nums[0]);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] - nums[i] != 1){
                if(!str.equals(String.valueOf(nums[i]))){
                str= str + "->" + nums[i];
                }
                li.add(str);
                str = String.valueOf(nums[i+1]);
            }
        }
        if(!str.equals(String.valueOf(nums[nums.length-1]))){
                str= str + "->" + nums[nums.length-1];
        }
        li.add(str);
        return li;
    }
}
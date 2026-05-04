class Solution {
    public int maxRotateFunction(int[] nums) {
       int sum = 0 ,max = 0, f = 0;
       for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          f+= i*nums[i];
       } 
       max = f;
       for(int k=1;k<nums.length;k++){
         f = f + sum - nums.length * nums[nums.length-k];
         max = Math.max(max,f);
       }
       return max;
    }
}
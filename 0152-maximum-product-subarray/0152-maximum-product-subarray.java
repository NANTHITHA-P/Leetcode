class Solution {
    public int maxProduct(int[] nums) {
       int curmin = 1;
       int curmax = 1;
       int res = nums[0];
       for(int num : nums){
         int temp1 = curmin*num;
         int temp2 = curmax*num;
         curmin = Math.min(num,Math.min(temp1,temp2));
         curmax = Math.max(num,Math.max(temp1,temp2));
        res = Math.max(curmax,res);
       }
       return res;
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        else{
            int target = sum/2;
            boolean[] dp = new boolean[target+1];
            dp[0]=true;
            for(int i=0;i<nums.length;i++){
                for(int j=target;j>=nums[i];j--){
                    int index = j-nums[i];
                       if(dp[index]==true){
                         dp[j] = true;
                       }
               }
            }
        return dp[target];
        }
    }
}
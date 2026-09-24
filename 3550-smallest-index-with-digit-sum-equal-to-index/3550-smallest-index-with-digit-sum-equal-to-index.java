class Solution {
    public int smallestIndex(int[] nums) {
        int res = Integer.MAX_VALUE,flag = 0;
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int sum = 0;
            while(x>0){
                int rem = x%10;
                sum+=rem;
                x/=10;
            }
            if(sum == i){
                res = Math.min(res,sum);
                flag = 1;
            }
        }
        if(flag == 1)
        return res;
        else return -1;
    }
}
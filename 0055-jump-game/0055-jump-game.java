class Solution {
    public boolean canJump(int[] nums) {
        int max = 0 ;
      for(int i=0;i<nums.length;i++){
        if(i>max) return false; 
        max = Math.max(max,i+nums[i]);//from that position how many max steps we can take is i+nums[i ]
        //if(max>=nums.length-1) return true;
      }
      return true;
    }
}
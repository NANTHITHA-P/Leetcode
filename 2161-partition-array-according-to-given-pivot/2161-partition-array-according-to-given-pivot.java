class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> eq = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) left.add(nums[i]);
            if(nums[i]==pivot) eq.add(nums[i]);
            if(nums[i]>pivot) right.add(nums[i]);
        }
        int i = 0;
       for(int num:left){
          nums[i++] = num;
       }
       for(int num:eq){
          nums[i++] = num;
       }
       for(int num:right){
          nums[i++] = num;
       }
       return nums;
    }
}
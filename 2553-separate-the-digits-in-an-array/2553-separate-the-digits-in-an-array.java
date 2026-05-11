class Solution {
    public int[] separateDigits(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
        List<Integer> li = new ArrayList<>();
            int rev = 0;
            while(num>0){
                int rem = num%10;
                rev = rev *10+rem;
                num/=10;
                li.add(rem);
            }
            Collections.reverse(li);
            res.add(li);
        }
        int size = 0;
        for(List<Integer> sub:res){
            size+=sub.size();
        }
        int[] arr = new int[size];
        int index = 0;
        for(List<Integer> sub:res){
           for(int num : sub){
              arr[index++] = num;
           }
        }
        return arr;
    }
}
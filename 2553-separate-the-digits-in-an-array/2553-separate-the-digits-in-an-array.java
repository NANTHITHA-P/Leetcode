class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int num : nums){
            String s = String.valueOf(num);
            for(char ch:s.toCharArray()){
                li.add(ch-'0');
            }
        }
        int[] res = new int[li.size()];
        for(int i=0;i<res.length;i++){
            res[i] = li.get(i);
        }
        return res;
    }
}
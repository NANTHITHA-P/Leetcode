class Solution {
    public static List<List<Integer>> ans;
    public static void permutation(List<Integer> arr,List<Integer> ansf){
        if(arr.size()==0){
            ans.add(new ArrayList<>(ansf));
            return;
        }
        for(int i=0;i<arr.size();i++){
            ansf.add(arr.get(i));
        List<Integer> temp = new ArrayList<>(arr);
        temp.remove(i);
        permutation(temp,ansf);
        ansf.remove(ansf.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        permutation(arr,new ArrayList<>());
        return ans;
    }
} 
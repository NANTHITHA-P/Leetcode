class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        for(int i=0;i<s.length();i++){
            ans[i] =  Integer.MAX_VALUE;
        }
        for(int i=0;i<s.length();i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==c){
                    min = Math.abs(i-j);
                    ans[i] = Math.min(min,ans[i]);
                }
            }
        }
        return ans;
    }
}
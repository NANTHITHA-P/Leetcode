class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            int p = 26-index;
            res += (p*(i+1));
        }
        return res;
    }
}
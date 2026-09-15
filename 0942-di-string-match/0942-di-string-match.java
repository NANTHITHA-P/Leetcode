class Solution {
    public int[] diStringMatch(String s) {
        int[] perm = new int[s.length()+1];
        int low = 0,high = s.length(),j=0;
        for(int i=0;i<perm.length && j<s.length();i++){
            if(s.charAt(j)=='I'){
                perm[i] = low++;
            }
            if(s.charAt(j) == 'D'){
                perm[i] = high--;
            }
            j++;
        }
        perm[s.length()] = low;
        return perm;
    }
}
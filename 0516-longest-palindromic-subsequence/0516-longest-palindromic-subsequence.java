class Solution {
    public int lps(String s,int i,int j,int[][] dp){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)) return dp[i][j] = lps(s,i+1,j-1,dp)+2;
        return dp[i][j] = Math.max(lps(s,i,j-1,dp),lps(s,i+1,j,dp));
    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        return lps(s,0,s.length()-1,dp);
    }
}
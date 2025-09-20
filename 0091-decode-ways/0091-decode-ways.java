class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0){
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0)!='0'?1:0;
        if(dp[1]==0) return 0;
        for(int i=2;i<=n;i++){
            int f = Integer.valueOf(s.substring(i-1,i));
            int se = Integer.valueOf(s.substring(i-2,i));
            if(f>=1 && f<=9){
                dp[i]+=dp[i-1];
            }
            if(se>=10 && se<=26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
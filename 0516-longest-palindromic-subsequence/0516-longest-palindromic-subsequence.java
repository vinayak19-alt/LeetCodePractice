class Solution {
    int[][] dp = new int[1000][1000];
    String str;
    public int helper(int l, int r){
        if(l == r+1){
            return 0;
        }
        if(l == r){
            return 1;
        }
        if(dp[l][r] > 0){
            return dp[l][r];
        }
        if(str.charAt(l) == str.charAt(r)){
            dp[l][r] = helper(l+1, r-1)+2;
        }
        dp[l][r] = Math.max(dp[l][r], helper(l+1, r));
        dp[l][r] = Math.max(dp[l][r], helper(l, r-1));

        return dp[l][r];
    }
    public int longestPalindromeSubseq(String s) {
        str = s;
        return helper(0, str.length()-1);
    }
}
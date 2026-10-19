class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m+1][n+1];
        //base case
        for(int j=0; j<=n; j++) dp[0][j] = 0;
        for(int i=0; i<=m; i++) dp[i][0] = 0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    private int helper(String s1, int i1, String s2, int i2, int[][] dp){
        if(i1 < 0 || i2 < 0) return 0;
        if(dp[i1][i2] != -1) return dp[i1][i2];
        if(s1.charAt(i1) == s2.charAt(i2)) return dp[i1][i2] = 1 + helper(s1, i1-1, s2, i2-1, dp);

        return dp[i1][i2] = Math.max(helper(s1, i1-1, s2, i2, dp), helper(s1, i1, s2, i2-1, dp));
    }
}
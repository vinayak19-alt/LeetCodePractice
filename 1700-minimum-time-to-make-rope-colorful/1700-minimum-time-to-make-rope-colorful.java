class Solution {
    public int minCost(String s, int[] neededTime) {
        int n = neededTime.length;
        int[] dp = new int[n];
        dp[0]=0;
        for(int i=1; i<n; i++){
            if(i < n && (s.charAt(i) == s.charAt(i-1))){
                dp[i]= Math.min(neededTime[i], neededTime[i-1]) + dp[i-1];
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }else{
                dp[i]=dp[i-1];
            }
        }
        return dp[n-1];
    }
}
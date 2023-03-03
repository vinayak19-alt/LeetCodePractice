Qustion lnk - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            ans = Math.max(prices[i]-min, ans);
        }
        return ans;
    }
}

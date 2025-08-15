class Solution {
    public int maxSubArray(int[] nums) {
        //using Kadane's ALgorithm
        int ans = nums[0];
        int maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            ans = Math.max(ans + nums[i], nums[i]);
            maxSum = Math.max(maxSum, ans);
        }
        return maxSum;
    }
}
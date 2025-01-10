class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }
    public int helper(int[] nums, int target, int index, int sum){
        if(index==nums.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        int left = helper(nums, target, index+1, sum+nums[index]);
        int right = helper(nums, target, index+1, sum-nums[index]);
        return left + right;
    }
}
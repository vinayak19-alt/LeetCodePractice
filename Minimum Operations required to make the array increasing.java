Question link - https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/

class Solution {
    public int minOperations(int[] nums) {
        int minimum_operations = 0;
        for(int i=1;i<nums.length;i++){
            minimum_operations += Math.max(nums[i-1]+1,nums[i]) - nums[i];
            nums[i] = Math.max(nums[i-1]+1,nums[i]);
        }
        return minimum_operations;
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, maxCount=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count=0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
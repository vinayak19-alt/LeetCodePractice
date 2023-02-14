Question link - https://leetcode.com/problems/maximum-gap/description/

class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int max=0;
        if(nums.length<2){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            c=nums[i+1]-nums[i];
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}

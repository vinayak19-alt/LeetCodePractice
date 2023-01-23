Question link - https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        int l=0;
        for(i=0; i<nums.length; i++){
            if(l==nums[i]){
                l++;
            }else{
                break;
            }
        }
    return i;
    }
}

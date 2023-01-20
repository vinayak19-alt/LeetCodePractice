Question link - https://leetcode.com/problems/remove-element/submissions/881904895/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<=nums.length-1; i++){
            if(nums[i]!=val){
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}

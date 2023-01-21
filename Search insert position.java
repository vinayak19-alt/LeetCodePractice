Question link - https://leetcode.com/problems/search-insert-position/submissions/882468371/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0, j= nums.length-1;
        while(i<=j){
            int mid= (i + j)/2;
            if(target<nums[mid]){
                j = mid-1;
            }else if(target>nums[mid]){
                i = mid+1;
            }
            else {
                return mid;
            }
        }
        return i;
    }
}

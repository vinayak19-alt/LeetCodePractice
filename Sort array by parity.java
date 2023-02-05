Question link - https://leetcode.com/problems/sort-array-by-parity/description/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                int temp=nums[index];
                nums[index]=nums[i];
                index++;
                nums[i]=temp;
            }
        }
        return nums;
    }
}

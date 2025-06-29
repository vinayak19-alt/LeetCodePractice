class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i] % 2!=0 && nums[j]%2==0){
                int num = nums[i];
                nums[i] = nums[j];
                nums[j]=num;
            }else if(nums[i]%2!=0 && nums[j]%2!=0){
                j--;
            }else if(nums[i]%2==0 && nums[j]%2==0){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return nums;
    }
}
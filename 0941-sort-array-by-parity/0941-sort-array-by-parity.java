class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while(i < j){
            if(nums[i] % 2 != 0 && nums[j] % 2 == 0){
                swap(nums, i, j);
                i++;
                j--;
            }else if(nums[i] % 2 != 0 && nums[j] % 2 != 0){
                j--;
            }else if(nums[i] % 2 == 0 && nums[j] % 2 == 0){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return nums;
    }
    public void swap(int[] arr , int i, int j){
        int num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
    }
}
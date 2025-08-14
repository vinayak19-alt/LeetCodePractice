class Solution {
    public void moveZeroes(int[] nums) {
        int i=1, j=0;
        while(i < nums.length){
            if(nums[j] == 0 && nums[i] != 0){
                swap(nums, j, i);
                j++;
            }else if (nums[j] != 0){
                j++;
            }
            i++;
        }
    }
    private void swap(int[] arr, int a, int b){
        int num = arr[a];
        arr[a] = arr[b];
        arr[b] = num;
    }
}
class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0, j=1;
        while(j < nums.length){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
        }
        i=0;
        j=1;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j] !=0){
                swap(nums, i, j);
                i++;
                j=i+1;
            }else if(nums[i] == 0 && nums[j] == 0){
                j++;
            }else{
                i++;
                j++;
            }
        }
        return nums;
    }
    public void swap(int[] arr, int i, int j){
        int num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
    }
}
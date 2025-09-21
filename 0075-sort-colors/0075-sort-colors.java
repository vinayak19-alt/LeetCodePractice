class Solution {
    public void sortColors(int[] nums) {
        int start=0, mid=0, end=nums.length-1;
        while(mid <= end){
            if(nums[mid] == 0){
                swap(nums, start, mid);
                start++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums, mid, end);
                end--;
            }
        }
    }
    public void swap(int[] arr, int i, int j){
        int num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
    }
}
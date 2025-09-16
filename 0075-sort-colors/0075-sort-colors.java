class Solution {
    public void sortColors(int[] nums) {
        int start=0, mid=0, end = nums.length-1;
        while(mid <= end){
            if(nums[mid] == 0){
                int num = nums[start];
                nums[start] = nums[mid];
                nums[mid] = num;
                start++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int num = nums[mid];
                nums[mid] = nums[end];
                nums[end] = num;
                end--;
            }
        }
    }
}
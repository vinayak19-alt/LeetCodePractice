class Solution {
    public void nextPermutation(int[] nums) {
        //we have to traverse from the end of the array and find a number that is lesser than the
        //previous number, then we have to find the number that is bigger than that number but
        //smaller than the ones we already traversed, then we swap those two numbers and reverse
        //the array from that point to the end to get the exact next permutation
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;

        if(i>=0){
            int j= nums.length-1;
            while(j>=0 && nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i+1);
    }
    public void swap(int[] arr, int i, int j){
        int num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
    }
    public void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
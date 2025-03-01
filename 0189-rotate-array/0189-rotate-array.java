class Solution {
    public void rotate(int[] nums, int k) {
        int n = k % nums.length;
        int[] temp = new int[nums.length];
        for(int i=0; i<n; i++){
            temp[i] = nums[nums.length-n+i];
        }
        for(int i=0; i<nums.length-n; i++){
            temp[i+n] = nums[i];
        }
        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
    }
}
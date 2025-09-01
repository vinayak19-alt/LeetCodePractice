class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0, j=1;
        while(j < nums.length){
            if((isEven(i) && !isEven(nums[i]) && isEven(nums[j])) || (!isEven(i) && isEven(nums[i]) && !isEven(nums[j]))){
                swap(nums, i, j);
                i++;
                j=i+1;
            }else if((!isEven(i) && isEven(nums[i]) && isEven(nums[j])) || (isEven(i) && !isEven(nums[i]) && !isEven(nums[j]))){
                j++;
            }else {
                i++;
                j++;
            }
        }
        return nums;
    }
    public boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public void swap(int[] arr, int i, int j){
        int num = arr[i];
        arr[i]=arr[j];
        arr[j] = num;
    }
}
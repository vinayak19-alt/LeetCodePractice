class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i=0, j=i+1;
        while(j < nums.length){
            if((nums[i]%2==0 && i%2!=0 && nums[j]%2!=0) || (nums[i]%2!=0 && i%2==0 && nums[j]%2==0)){
                int num = nums[i];
                nums[i] = nums[j];
                nums[j] = num;
                i++;
                j=i+1;;
            }else if((nums[i]%2==0 && i%2!=0 && nums[j]%2==0) || (nums[i]%2!=0 && i%2==0 && nums[j]%2!=0)){
                j++;
            }else{
                i++;
                j++;
            }
        }
        return nums;
    }
}
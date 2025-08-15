class Solution {
    public int majorityElement(int[] nums) {
        //usinf Boyer-Moores voting algorithm
        int count=0, element =-1;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
                count=1;
            }else{
                if(nums[i] ==  element){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == element){
                count++;
            }
        }
        return (count > n/2) ? element : -1;
    }
}
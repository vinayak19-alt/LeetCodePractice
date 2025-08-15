class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];
        int e=0, o=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                if(e < positive.length){
                    positive[e] = nums[i];
                    e++;
                }
            }else{
                if(o < negative.length){
                    negative[o] = nums[i];
                    o++;
                }
            }
        }
        e=0;
        o=0;
        for(int i=0; i<nums.length; i++){
            if(i == 0){
                nums[i] = positive[e++];
            }else if(nums[i-1] > 0){
                nums[i] = negative[o++];
            }else{
                nums[i] = positive[e++];
            }
        }
        return nums;
    }
}
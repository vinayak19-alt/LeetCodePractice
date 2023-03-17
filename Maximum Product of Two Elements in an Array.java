Question link - https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int x=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0;j<nums.length; j++){
                x=(nums[i]-1)*(nums[j]-1);
                if(i==j){
                    break;
                }
                if(x>max){
                    max=x;
                }
            }
        }
        return max;
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int e=0, o=1;
        for(int num : nums){
            if(num >= 0){
                arr[e] = num;
                e+=2;
            }else {
                arr[o] =num;
                o+=2;
            }
        }
        return arr;
    }
}
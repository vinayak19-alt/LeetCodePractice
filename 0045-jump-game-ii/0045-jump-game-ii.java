class Solution {
    public int jump(int[] nums) {
        int jumps = 0, l = 0, r = 0;
        while(r<nums.length-1){
            int farthest = 0;
            for(int i = l; i<=r; i++){
                farthest = Math.max(i+nums[i], farthest);
            }
            l=r+1;
            r=farthest;
            jumps+=1;
        }
        return jumps;
    }
}
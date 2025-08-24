class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        TreeSet<Integer> set = new TreeSet<>();
        int count=1;
        int longest=1;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int val = set.first();
        set.remove(val);
        for(int num : set){
            if(num == val+1){
                count++;
            }else{
                count=1;
            }
            longest = Math.max(longest, count);
            val=num;
        }
        return longest;
    }
}
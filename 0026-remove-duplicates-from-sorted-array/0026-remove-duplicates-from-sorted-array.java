class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        int j=0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int num : set){
            nums[j] = num;
            j++;
        }
        return set.size();
    }
}
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        int r=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key){
                int l = Math.max(r, i-k);
                r = Math.min(nums.length-1, i+k)+1;
                for(int j=l; j < r; ++j){
                    list.add(j);
                }
            }
        }
        return list;
    }
}
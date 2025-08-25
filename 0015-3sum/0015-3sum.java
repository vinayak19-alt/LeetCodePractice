class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i< nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k){
                int total = nums[i] + nums[j] + nums[k];
                if(total < 0){
                    j++;
                }else if(total > 0){
                    k--;
                }else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int res=-1;
        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }else if(sum < target){
                    if(target-sum < diff){
                        diff = target-sum;
                        res=sum;
                    }
                    j++;
                }else if(sum > target){
                    if(sum-target < diff){
                        diff = sum-target;
                        res = sum;
                    }
                    k--;
                }
            }
        }
        return res;
    }
}
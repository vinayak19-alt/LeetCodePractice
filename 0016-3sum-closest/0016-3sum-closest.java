class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int count=0;
        int sum=0;
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;
            int k= nums.length-1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target-sum);
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    return sum;
                }
                map.put(diff, sum);
            }
        }
        int min=Integer.MAX_VALUE;;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() < min){
                min= entry.getKey();
            }
        }
        return map.get(min);
    }
}
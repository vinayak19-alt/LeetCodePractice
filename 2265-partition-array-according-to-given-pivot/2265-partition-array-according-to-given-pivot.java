class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int pivotIndex = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot){
                pivotIndex = i;
                break;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }else if(nums[i] > pivot){
                right.add(nums[i]);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] == pivot && i != pivotIndex){
                left.add(nums[i]);
            }
        }
        int j=0;
        while(j < left.size()){
            nums[j] = left.get(j);
            j++;
        }
        nums[j] = pivot;
        j++;
        for(int i=0; i<right.size(); i++){
            nums[j] = right.get(i);
            j++;
        }
        return nums;
    }
}
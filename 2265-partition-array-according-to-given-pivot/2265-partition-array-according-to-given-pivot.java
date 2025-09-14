class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i=0; i< nums.length; i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }
            if(nums[i] > pivot){
                right.add(nums[i]);
            }
        }
        int pivotLen = nums.length - (left.size() + right.size());
        for(int i=0; i<pivotLen; i++){
            left.add(pivot);
        }
        left.addAll(right);
        int[] arr = left.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
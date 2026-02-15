class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    public void helper(List<List<Integer>> result, List<Integer> seq, int[] arr, int target, int index){
        if(index == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(seq));
            }
            return;
        }
        if(arr[index] <= target){
            seq.add(arr[index]);
            helper(result, seq, arr, target-arr[index], index);
            seq.remove(seq.size()-1);
        }
        helper(result, seq, arr, target, index+1);
    }
}
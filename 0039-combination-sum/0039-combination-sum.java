class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, target, result, new ArrayList<>(), 0, 0);
        return result;
    }
    public void helper(int[] arr, int target, List<List<Integer>> list, List<Integer> seq, int sum, int index){
        if(index == arr.length){
            if(sum == target){
                list.add(new ArrayList<>(seq));
            }
            return;
        }
        if(target-sum >= arr[index]){
            seq.add(arr[index]);
            helper(arr, target, list, seq, sum+arr[index], index);
            seq.remove(seq.size()-1);
        }
        helper(arr, target, list, seq, sum, index+1);
    }
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    public void helper(List<List<Integer>> result, List<Integer> seq, int[] arr, int target, int index){
        if(target == 0){
            result.add(new ArrayList<>(seq));
            return;
        }
        for(int i= index; i<arr.length; i++){
            if(i > index && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            seq.add(arr[i]);
            helper(result, seq, arr, target-arr[i], i+1);
            seq.remove(seq.size()-1);
        }
    }
}
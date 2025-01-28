class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }
    public void helper(int[] arr, int target, List<List<Integer>> list, List<Integer> temp, int start){
        if(target < 0){
            return;
        }else if(target==0){
            list.add(new ArrayList<>(temp));
        }else{
            for(int i=start; i<arr.length; i++){
                temp.add(arr[i]);
                helper(arr, target-arr[i], list, temp, i);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}
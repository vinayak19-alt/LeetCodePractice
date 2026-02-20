class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> list, int[] arr, int index){
        if(index == arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        helper(result, list, arr, index+1);
        list.remove(list.size()-1);
        helper(result, list, arr, index+1);
    }
}
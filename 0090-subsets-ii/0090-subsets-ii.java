class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, list, new ArrayList<>(), 0);
        return list;
    }
    private void helper(int[] arr, List<List<Integer>> list, List<Integer> res, int index){
        list.add(new ArrayList<>(res));
        for(int i=index; i<arr.length; i++){
            if(i != index && arr[i] == arr[i-1]) continue;
            res.add(arr[i]);
            helper(arr, list, res, i+1);
            res.remove(res.size()-1);
        }
    }
}
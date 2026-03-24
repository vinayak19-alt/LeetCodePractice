class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, list, new ArrayList<>(), 0);
        return list;
    }
    public void helper(int[] arr, List<List<Integer>> list, List<Integer> seq, int index){
        list.add(new ArrayList<>(seq));
        for(int i=index; i<arr.length; i++){
            if(i != index && arr[i] == arr[i-1]) continue;
            seq.add(arr[i]);
            helper(arr, list, seq, i+1);
            seq.remove(seq.size()-1);
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, 0);
        return res;
    }
    public void helper(int[] arr, List<List<Integer>> ans, int index){
        if(index == arr.length){
            List<Integer> seq = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                seq.add(arr[i]);
            }
            ans.add(new ArrayList<>(seq));
            return;
        }
        for(int i=index; i<arr.length; i++){
            swap(i, index, arr);
            helper(arr, ans, index+1);
            swap(i, index, arr);
        }
    }
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
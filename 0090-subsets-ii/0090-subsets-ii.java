class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), nums, 0);
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> list, int[] arr, int index){
        result.add(new ArrayList<>(list));
        for(int i = index; i<arr.length; i++){
            /*
            to put it simply we are doing this check to avoid duplicate subsets in
            the result list, because if let's say after a recusrion call we are at index 2
            then we would take it because we got ata new index but in that same same recursion
            call if the next element is same then we would check that if we landed on a
            new element or we are next to that element and it is same as the last do we
            ignore it to keep our subsets unique
            */
            if(i != index && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            helper(result, list, arr, i+1);
            list.remove(list.size()-1);
        }
    }
}
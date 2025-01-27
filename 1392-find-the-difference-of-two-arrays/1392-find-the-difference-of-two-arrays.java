class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            list1.add(nums1[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<nums2.length; i++){
            list2.add(nums2[i]);
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for(int i=0; i<nums1.length; i++){
            if(!list2.contains(nums1[i])){
                set1.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(!list1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        for(int n : set1){
            ans.get(0).add(n);
        }
        for(int n : set2){
            ans.get(1).add(n);
        }
        return ans;
    }
}
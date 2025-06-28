class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int k=0;
        for(int i=0; i< nums1.length; i++){
            map.put(nums1[i][0], map.getOrDefault(nums1[i][0], 0) + nums1[i][1]);
        }
        for(int i=0; i< nums2.length; i++){
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int[][] arr = new int[map.size()][2];
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            arr[k][0] = entry.getKey();
            arr[k][1] = entry.getValue();
            k++;
        }
        return arr;
    }
}
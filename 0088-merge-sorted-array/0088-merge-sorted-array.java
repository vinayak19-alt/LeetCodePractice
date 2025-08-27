class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] > nums2[j] && m < nums1.length){
                shift(nums1, i);
                nums1[i] = nums2[j];
                m++;
                i++;
                j++;
            }else if(i == m || nums1[i] == 0){
                nums1[m] = nums2[j];
                m++;
                j++;
            }else{
                i++;
            }
        }
    }
    private void shift(int[] nums1, int i){
        for(int j = nums1.length-1; j>i; j--){
            nums1[j] = nums1[j-1];
        }
        nums1[i] = 0;
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        while(i< nums1.length && j< nums2.length){
            if(nums1[i] > nums2[j] && m< nums1.length){
                swap(nums1, i);
                nums1[i] = nums2[j];
                i++;
                j++;
                m++;
            }else if(i == m && nums1[m] == 0){
                nums1[m] = nums2[j];
                m++;
                j++;
            }
            else if(nums1[i] <= nums2[j]){
                i++;
            }
        }
    }
    public void swap(int[] arr, int i){
        for(int j = arr.length-2; j>=i; j--){
            arr[j+1] = arr[j];
        }
    }
}
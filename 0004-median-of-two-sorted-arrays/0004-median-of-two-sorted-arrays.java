class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int k=0;
        for(int i=0; i<nums1.length; i++){
            arr[k++]=nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            arr[k++]=nums2[i];
        }
        Arrays.sort(arr);
        int len = arr.length;
        if(len%2==1){
            return (double)(arr[len/2]);
        }else{
            int mid1 = arr[len/2 -1];
            int mid2 = arr[len/2];
            return ((double)mid1 +(double)mid2) / 2.0;
        }
    }
}
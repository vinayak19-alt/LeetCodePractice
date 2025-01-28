class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int[] arr = new int[gain.length+1];
        arr[0]=0;
        for(int i=0; i<gain.length; i++){
            sum += gain[i];
            arr[i+1]=sum;
        }
        return findMax(arr);
    }
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
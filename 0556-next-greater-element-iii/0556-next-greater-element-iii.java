class Solution {
    public int nextGreaterElement(int n) {
        int[] arr = String.valueOf(n).chars().map(c -> c -'0').toArray();
        int i = arr.length-2;
        while(i >= 0 && arr[i] >= arr[i+1])i--;
        if(i >= 0){
            int j= arr.length-1;
            while(j >= 0 && arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i+1);
        int num = Arrays.stream(arr).reduce(0, (acc, d) -> acc*10 + d);
        if(num > n){
            return num;
        }
        return -1;
    }
    public void swap(int[] arr, int i, int j){
        int num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;
    }
    public void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
class Solution {
    public int numSquares(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0]=0;
        int count = 1;
        while(count*count<=n){
            int sq = count* count;
            for(int i=sq; i<=n; i++){
                arr[i] = Math.min(arr[i-sq] + 1, arr[i]);
            }
            count++;
        }
        return arr[n];
    }
}
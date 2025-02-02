class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=0;
        for(int i=2; i<=n; i++){
            int option1 = arr[i-1] + cost[i-1];
            int option2 = arr[i-2] + cost[i-2];
            arr[i] = Math.min(option1, option2);
        }
        return arr[n];
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] arr = new Integer[m][n];
        return helper(m-1, n-1, arr);
    }
    public int helper(int r, int c, Integer[][] arr){
        if(r==0 && c==0){
            return 1;
        }
        if(r<0 || c<0){
            return 0;
        }
        if(arr[r][c] != null){
            return arr[r][c];
        }
        int up = helper(r-1, c, arr);
        int left = helper(r, c-1, arr);
        arr[r][c] = up+left;
        return arr[r][c];
    }
}
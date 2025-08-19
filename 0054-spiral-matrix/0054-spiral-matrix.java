class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix[0].length-1;
        int n = matrix.length-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<=m; j++){
                list.add(matrix[i][j]);
            }
            for(int j=i+1; j<=n; j++){
                list.add(matrix[j][m]);
            }
            if(n != i){
                for(int j=m-1; j>=i; j--){
                    list.add(matrix[n][j]);
                }
            }
            if(m != i){
                for(int j=n-1; j>i; j--){
                    list.add(matrix[j][i]);
                }
            }
            m--;
            n--;
            if(m < i+1 || n < i+1) break;;
        }
        return list;
    }
}
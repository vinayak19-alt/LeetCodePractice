class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i < j){
                    int num = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]=num;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            int a=0, b = matrix.length-1;
            while(a < b){
                int num = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = num;
                a++;
                b--;
            }
        }
    }
}
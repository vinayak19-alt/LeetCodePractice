class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        helper(board, result, n, 0);
        return result;
    }
    public void helper(char[][] board, List<List<String>> result, int n, int row){
        if(row == board.length){
            result.add(addRow(board));
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                helper(board, result, n, row+1);
                board[row][col] = '.';
            }
        }
    }
    public List<String> addRow(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] arr : board){
            String str = new String(arr);
            list.add(str);
        }
        return list;
    }
    public boolean isSafe(char[][] board, int row, int col){
        //check in above rows
        for(int i=0;i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check left diagonal for queen
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            }
        }
        //check right diagonal for queen
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        return helper(board, 0);
    }
    public int helper(char[][] board, int row){
        int count=0;
        if(row == board.length){
            return 1;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                count+=helper(board, row+1);
                board[row][col] = '.';
            }
        }
        return count;
    }
    public boolean isSafe(char[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            }
        }
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
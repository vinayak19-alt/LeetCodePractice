class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        solve(board, list, n, 0);
        return list;
    }
    public void solve(char[][] board, List<List<String>> list, int n, int row){
        if(board.length == row){
            list.add(addRow(board));
            return;
        }
        for(int col = 0; col<n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                solve(board, list, n, row+1);
                board[row][col] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col){
        //check for above
        for(int i=0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //check for left diagonal
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            }
        }
        //check for right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public List<String> addRow(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String str = new String(board[i]);
            list.add(str);
        }
        return list;
    }
}
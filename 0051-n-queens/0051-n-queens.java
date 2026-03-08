class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        helper(board, ans, 0);
        return ans;
    }
    public void helper(char[][] board, List<List<String>> ans, int row){
        if(row == board.length){
            ans.add(addRow(board));
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, ans, row+1);
                board[row][col] = '.';
            }
        }
    }
    public List<String> addRow(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String row = new String(board[i]);
            list.add(row);
        }
        return list;
    }
    public boolean isSafe(int row, int col, char[][] board){
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
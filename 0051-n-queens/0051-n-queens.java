class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='.';
            }
        }
        List<List<String>> list = new ArrayList<>();
        queens(board, list, 0);
        return list;
    }
    public void queens(char[][] board, List<List<String>> list, int row){
        if(row == board.length){
            list.add(addRow(board));
            return;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q';
                queens(board, list, row+1);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col){
        //check vertically
        for(int i=0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //check left diagonal
        int maxLeft = Math.min(row, col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]=='Q'){
                return false;
            }
        }
        //check right diagonal
        int maxRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]=='Q'){
                return false;
            }
        }
        return true;
    }
    public List<String> addRow(char[][] board){
        List<String> list = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String row = new String(board[i]);
            list.add(row);
        }
        return list;
    }
}
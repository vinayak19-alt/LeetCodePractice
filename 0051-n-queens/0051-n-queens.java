class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];
        solve(board, result, 0, leftRow, upperDiagonal, lowerDiagonal);
        return result;
    }
    public void solve(char[][] board, List<List<String>> result, int row, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal){
        if(row == board.length){
            result.add(addRow(board));
            return;
        }
        for(int col=0; col<board.length; col++){
            if(leftRow[col] == 0 && upperDiagonal[board.length-1 + row - col] == 0
                && lowerDiagonal[row+col] == 0){
                board[row][col] = 'Q';
                leftRow[col] = 1;
                upperDiagonal[board.length - 1 + row - col] = 1;
                lowerDiagonal[row+col] = 1;
                solve(board, result, row+1, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col] = '.';
                leftRow[col] = 0;
                upperDiagonal[board.length - 1 + row - col] = 0;
                lowerDiagonal[row+col] = 0;
            }
        }
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
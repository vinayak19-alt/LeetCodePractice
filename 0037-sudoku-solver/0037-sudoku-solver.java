class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }

    public boolean sudoku(char[][] board) {
        int n = board.length;
        int row = -1, col = -1;
        boolean emptyLeft = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = true;
                    break;
                }
            }
            if (emptyLeft) {
                break;
            }
        }

        // If no empty cell is left, Sudoku is solved
        if (!emptyLeft) {
            return true;
        }

        // Try placing digits 1-9 in the current empty cell
        for (int number = 1; number <= 9; number++) {
            char num = (char) (number + '0');
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (sudoku(board)) {
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true; 
    }
}
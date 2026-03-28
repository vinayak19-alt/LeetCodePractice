class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] vis = new int[board.length][board[0].length];
        int row = -1;
        int col = -1;
        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    vis[i][j] = 1;
                    if(helper(board, word, i, j, di, dj, vis, 1)){
                        return true;
                    }
                    vis[i][j] = 0;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word, int row, int col, int[] di, int[] dj, int[][] vis, int index){
        if(index == word.length()){
            return true;
        }
        for(int i=0; i<4; i++){
            int nextRow = row + di[i];
            int nextCol = col + dj[i];
            if(nextRow >= 0 && nextCol >= 0 && nextRow < board.length && nextCol < board[0].length
                && vis[nextRow][nextCol] != 1 && board[nextRow][nextCol] == word.charAt(index)){
                char ch = board[nextRow][nextCol];
                vis[nextRow][nextCol] = 1;
                if(helper(board, word, nextRow, nextCol, di, dj, vis, index+1)){
                    return true;
                }
                vis[nextRow][nextCol] = 0;
            }
        }
        return false;
    }
}
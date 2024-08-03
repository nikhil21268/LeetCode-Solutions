package BattleshipsInABoard;

class Solution {

    boolean[][] visited;

    public void dfs(char[][] board, int i, int j){


        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return;
        if(visited[i][j]) return;

        visited[i][j] = true;

        if(board[i][j] != 'X') return;

        dfs(board, i + 1, j);
        dfs(board, i, j + 1);
        dfs(board, i - 1, j);
        dfs(board, i, j - 1);
    }

    public int countBattleships(char[][] board) {

        int res = 0;

        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(!visited[i][j] && board[i][j] == 'X') {
                    dfs(board, i, j);
                    res++;
                }
            }
        }

        return res;
    }
}

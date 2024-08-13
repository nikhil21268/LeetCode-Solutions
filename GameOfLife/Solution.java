package GameOfLife;

import java.util.Arrays;

class Solution {
    public void gameOfLife(int[][] board) {

        int[][] changes = new int[board.length][board[0].length];

        for (int i = 0; i < changes.length; i++) {
            for (int j = 0; j < changes[0].length; j++) {

                changes[i][j] = -1;

            }
        }


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                int curr = board[i][j];

                int liveNeighbors = 0;

                if (i - 1 >= 0 && j - 1 >= 0) liveNeighbors += board[i - 1][j - 1];
                if (i - 1 >= 0) liveNeighbors += board[i - 1][j];
                if (j - 1 >= 0) liveNeighbors += board[i][j - 1];
                if (i + 1 < board.length && j + 1 < board[0].length) liveNeighbors += board[i + 1][j + 1];
                if (j + 1 < board[0].length) liveNeighbors += board[i][j + 1];
                if (i + 1 < board.length) liveNeighbors += board[i + 1][j];
                if (i + 1 < board.length && j - 1 >= 0) liveNeighbors += board[i + 1][j - 1];
                if (i - 1 >= 0 && j + 1 < board[0].length) liveNeighbors += board[i - 1][j + 1];

                if (curr == 1 && liveNeighbors < 2) changes[i][j] = 0;
                else if (curr == 1 && (liveNeighbors == 2 || liveNeighbors == 3)) changes[i][j] = 1;
                else if (curr == 1 && liveNeighbors > 3) changes[i][j] = 0;
                else if (curr == 0 && liveNeighbors == 3) changes[i][j] = 1;

            }

        }

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if(changes[i][j] != -1){

                    board[i][j] = changes[i][j];

                }

            }
        }

    }

}
package AvailableCapturesForRook;

class Solution {
    public int numRookCaptures(char[][] board) {

        int res = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                char c = board[i][j];

                if(c == 'R'){

                    for (int k = i; k < board.length; k++) {

                        char d = board[k][j];

                        if(d == 'B') break;

                        if(d == 'p'){
                            res++;
                            break;
                        }
                    }

                    for (int k = i; k >= 0; k--) {

                        char d = board[k][j];

                        if(d == 'B') break;

                        if(d == 'p'){
                            res++;
                            break;
                        }
                    }


                    for (int k = j; k < board[0].length; k++) {

                        char d = board[i][k];

                        if(d == 'B') break;

                        if(d == 'p'){
                            res++;
                            break;
                        }
                    }


                    for (int k = j; k >= 0; k--) {

                        char d = board[i][k];

                        if(d == 'B') break;

                        if(d == 'p'){
                            res++;
                            break;
                        }
                    }

                }
            }
        }

        return res;
    }
}

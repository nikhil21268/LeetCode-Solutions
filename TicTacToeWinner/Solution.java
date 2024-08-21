package TicTacToeWinner;

class Solution {
    public String tictactoe(int[][] moves) {

        String res = "Pending";

        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = ' ';
            }
        }

        int idx = 0;
        for(int[] move: moves){

            int i = move[0];
            int j = move[1];

            if(idx % 2 == 0){
                matrix[i][j] = 'X';
            }
            else{
                matrix[i][j] = '0';
            }

            idx++;

        }

        char prevChar = ' ';
        for (int i = 0; i < 3; i++) {
            prevChar = ' ';
            for (int j = 0; j < 3; j++) {
                if(matrix[i][j] == ' ') break;
                if(prevChar == ' ') prevChar = matrix[i][j];
                else if(prevChar == '0' && matrix[i][j] != '0') break;
                else if(prevChar == 'X' && matrix[i][j] != 'X') break;
                else if(prevChar == matrix[i][j] && j == 2){
                    if(prevChar == 'X') res = "A";
                    else if(prevChar == '0') res = "B";
                }
            }
        }


        prevChar = ' ';
        for (int i = 0; i < 3; i++) {
            prevChar = ' ';
            for (int j = 0; j < 3; j++) {
                if(matrix[j][i] == ' ') break;
                if(prevChar == ' ') prevChar = matrix[j][i];
                else if(prevChar == '0' && matrix[j][i] != '0') break;
                else if(prevChar == 'X' && matrix[j][i] != 'X') break;
                else if(prevChar == matrix[j][i] && j == 2){
                    if(prevChar == 'X') {
                        res = "A";
                    }
                    else if(prevChar == '0') res = "B";
                }
            }
        }


        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]){
            if(matrix[0][0] == 'X') res = "A";
            if(matrix[0][0] == '0') res = "B";
        }


        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]){
            if(matrix[0][2] == 'X') res = "A";
            if(matrix[0][2] == '0') res = "B";
        }

        if(moves.length == 9 && (!res.equals("A") && !res.equals("B"))) return "Draw";

        return res;

    }
}
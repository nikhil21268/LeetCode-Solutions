package SetMatrixZeroes;

import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {

        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }

            }
        }


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if(rows.contains(i)){

                    for (int k = 0; k < matrix[0].length; k++) {

                        matrix[i][k] = 0;
                    }

                }


                if(cols.contains(j)){

                    for (int k = 0; k < matrix.length; k++) {

                        matrix[k][j] = 0;
                    }

                }

            }
        }

    }
}
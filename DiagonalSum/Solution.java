package DiagonalSum;

class Solution {
    public int diagonalSum(int[][] mat) {

        int res = 0;

        int i = 0;
        int j = 0;

        while (i < mat.length && j < mat[0].length){

            res += mat[i][j];

            i++;
            j++;

        }

        i = 0;
        j = mat[0].length - 1;

        while (i >= 0 && j >= 0){

            if(mat.length % 2 != 0 && i == mat.length/2 && i == j){
                i++;
                j--;
                continue;
            }

            res += mat[i][j];

            i++;
            j--;
        }

        return res;

    }
}
package RowWithMaxOnes;

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int[] res = new int[2];
        int glabalCount = 0;

        for (int i = 0; i < mat.length; i++) {

            int countOnes =  0;

            for (int j = 0; j < mat[0].length; j++) {

                if(mat[i][j] == 1) countOnes++;

            }

            if(glabalCount < countOnes) {
                glabalCount = countOnes;
                res[0] = i;
                res[1] = countOnes;
            }

        }

        return res;

    }
}
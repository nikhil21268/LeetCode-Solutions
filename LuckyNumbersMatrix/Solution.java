package LuckyNumbersMatrix;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int[] minRows = new int[matrix.length];
        int[] maxCols = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {

            int rowMax = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[0].length; j++) rowMax = Math.min(rowMax, matrix[i][j]);

            minRows[i] = rowMax;

        }

        for (int i = 0; i < matrix[0].length; i++) {

            int colMax = Integer.MIN_VALUE;

            for (int j = 0; j < matrix.length; j++) colMax = Math.max(colMax, matrix[j][i]);

            maxCols[i] = colMax;

        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                int num = matrix[i][j];

                if(num == minRows[i] && num == maxCols[j]) res.add(num);

            }

        }

        return res;

    }
}
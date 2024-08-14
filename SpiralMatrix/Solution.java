package SpiralMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {

    List<Integer> res;

    public void dfs(int[][] matrix, int i, int j, char dir){



        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return;
        if(matrix[i][j] == Integer.MIN_VALUE) return;
        res.add(matrix[i][j]);
        matrix[i][j] = Integer.MIN_VALUE;

        if(dir == 'r'){
            dfs(matrix, i, j + 1, 'r');
            dfs(matrix, i + 1, j, 'd');
            dfs(matrix, i, j - 1, 'l');
            dfs(matrix, i - 1, j, 'u');
        }
        else if(dir == 'd'){

            dfs(matrix, i + 1, j, 'd');
            dfs(matrix, i, j - 1, 'l');
            dfs(matrix, i - 1, j, 'u');
            dfs(matrix, i, j + 1, 'r');
        }


        else if(dir == 'l'){

            dfs(matrix, i, j - 1, 'l');
            dfs(matrix, i - 1, j, 'u');
            dfs(matrix, i, j + 1, 'r');
            dfs(matrix, i + 1, j, 'd');

        }


        else if(dir == 'u'){


            dfs(matrix, i - 1, j, 'u');
            dfs(matrix, i, j + 1, 'r');
            dfs(matrix, i + 1, j, 'd');
            dfs(matrix, i, j - 1, 'l');
        }

//
//        [[1,2,3,4],
//        [5,6,7,8],
//        [9,10,11,12],
//        [13,14,15,16]]
//        [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        res = new ArrayList<>();

        dfs(matrix, 0, 0, 'r');

        return res;

    }
}

package ToeplitzMatrix;

class Solution {

    int[][] visited;

    public boolean traverse(int i, int j, int[][] matrix, int toMatch){
        if(i >= matrix.length || j >= matrix[0].length) return true;
        visited[i][j] = 1;
        if(matrix[i][j] == toMatch){
            if(traverse(i+1, j+1, matrix, toMatch)) return true;
            else return false;
        }
        else{
            return false;
        }
    }

    public boolean isToeplitzMatrix(int[][] matrix) {

        boolean res = true;

        visited = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(visited[i][j] == 1) continue;
                if(!traverse(i, j, matrix, matrix[i][j])) return false;
            }
        }

        return res;

    }
}
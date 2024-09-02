package LargestLocalValuesInAMatrix;

class Solution {
    public int[][] largestLocal(int[][] grid) {

        int[][] res = new int[grid.length - 2][grid.length - 2];

        for (int i = 1; i < grid.length-1; i++) {
            for (int j = 1; j < grid.length-1; j++) {

                res[i-1][j-1] = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(grid[i-1][j-1], grid[i-1][j]), grid[i-1][j+1]), grid[i][j-1]), grid[i][j]), grid[i][j+1]), grid[i+1][j-1]), grid[i+1][j]), grid[i+1][j+1]);

            }
        }

        return res;

    }
}
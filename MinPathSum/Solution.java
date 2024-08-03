package MinPathSum;

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memory = new int[m][n];
        // fill the last cell with the value of the last cell in the grid
        memory[m - 1][n - 1] = grid[m - 1][n - 1];
        // fill the last row with the minimum path sum
        for(int i = n - 1; i >= 0; i--){
            memory[m - 1][i] = grid[m - 1][i] + memory[m - 1][i + 1];
        }
        // fill the last column with the minimum path sum
        for(int i = m - 1; i >= 0; i--){
            memory[i][n - 1] = grid[i][n - 1] + memory[i + 1][n - 1];
        }
        // fill the rest of the memory array using memory[i][j] = grid[i][j] + Math.min(memory[i + 1][j], memory[i][j + 1])
        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                memory[i][j] = grid[i][j] + Math.min(memory[i + 1][j], memory[i][j + 1]);
            }
        }
        return memory[0][0];
    }
}